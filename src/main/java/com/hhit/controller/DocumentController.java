package com.hhit.controller;
import com.hhit.model.Document;
import com.hhit.service.DocumentService;
import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.List;

@Controller
@RequestMapping(value="/doucument")
public class DocumentController {
    @Resource
    private DocumentService documentService;
    @RequestMapping(value="/addDocument")
    public String upload(HttpServletRequest request, @RequestParam("description") String description,
                         @RequestParam("file")MultipartFile file) throws Exception{
        System.out.println("查看描述"+description);
        if(!file.isEmpty()){
            //获取一个上传文件的路径
            String path=request.getServletContext().getRealPath("/images/");
            System.out.println("获取文件的上传路径"+path);
            //上传文件名,获取源文件的原始名
            String filename=file.getOriginalFilename();
            System.out.println("这个地方看看获取的文件名"+filename);
            File filepath=new File(path,filename);
            System.out.println("filepath的值"+filepath);
            if(!filepath.getParentFile().exists()){
                filepath.getParentFile().mkdirs();
            }
            //文件保存到目标文件中
            file.transferTo(new File(path+File.separator+filename));
            return "documentquery1";
        }else{
            return "error";
        }
    }
    /**
     * 文件对象上传
     * @param request
     * @param document
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/adddocument")
    public String upload1(HttpServletRequest request, @ModelAttribute Document document,
                          Model model) throws Exception{
        System.out.println("文件标题："+document.getTitle());
        System.out.println("对象文件描述"+document.getRemark());
        //System.out.println("看看get"+document.getFile());
        if(!document.getFile().isEmpty()){
            //获取一个上传文件的路径
            String path=request.getServletContext().getRealPath("/images/");
            System.out.println("获取文件的上传路径"+path);
            //上传文件名,获取源文件的原始名
            String filename=document.getFile().getOriginalFilename();
            //System.out.println("这个地方看看获取的文件名"+filename);
            File filepath=new File(path,filename);
            System.out.println("filepath的值"+filepath);
            if(!filepath.getParentFile().exists()){
                filepath.getParentFile().mkdirs();
            }
            //文件保存到目标文件中
            document.getFile().transferTo(new File(path+File.separator+filename));
            System.out.println("看看get"+document.getFile());
            document.setFilename(filename);//设置文件名
            document.setFilepath(path);//设置文件存储地方
            //下面开始数据库的信息操作
            HttpSession session=request.getSession();
            String username=(String)session.getAttribute("username");
            System.out.println("111111111111"+username);
            document.setUpuser(username);
            documentService.addDocument(document);
            System.out.println("添加成功");
            model.addAttribute("document",document);
            return "redirect:/doucument/documentquery.action";
        }else{
            return "error";
        }
    }
    /**
     * 文件的下载
     * @param request
     * @param filename
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/download")
    public ResponseEntity<byte[]> download(HttpServletRequest request,@RequestParam("filename")
                                           String filename,Model model) throws Exception{
        //下载文件的所在路径，至于下载到什么里边由浏览器默认配置
        String path=request.getServletContext().getRealPath("/images/");
        File file=new File(path+File.separator+filename);
        HttpHeaders headers=new HttpHeaders();
        //下载显示的文件名+解决中文乱码问题
        String downloadfIlename=new String(filename.getBytes("UTF-8"),"iso-8859-1");
        //通知浏览器以下载方法打开文件
        headers.setContentDispositionFormData("attachment",downloadfIlename);
        //二进制流数据转换文件下载
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        //201HttpStatus.CREATED
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers, HttpStatus.CREATED);
    }
    @RequestMapping(value="/documentquery")
    public String documentquery(ModelMap modelMap){
        List<Document> documentlist;
        documentlist=documentService.documentSearchall();
        modelMap.addAttribute("documentlist",documentlist);
        return "documentquery";
    }
}
