package com.hhit.controller;
import com.hhit.model.Document;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
@Controller
@RequestMapping(value="/doucument")
public class DocumentController {

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
            return "documentquery";
        }else{
            return "error";
        }
    }

    /**
     * 将对象与文件属性绑定
     * @param request
     * @param document
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/adddocument")
    public String upload1(HttpServletRequest request, @ModelAttribute Document document,
                          Model model) throws Exception{
        System.out.println("对象文件名获取测试"+document.getFilename());
        System.out.println("看看get"+document.getFile());
        if(!document.getFile().isEmpty()){
            //获取一个上传文件的路径
            String path=request.getServletContext().getRealPath("/images/");
            System.out.println("获取文件的上传路径"+path);
            //上传文件名,获取源文件的原始名
            String filename=document.getFile().getOriginalFilename();
            System.out.println("这个地方看看获取的文件名"+filename);
            File filepath=new File(path,filename);
            System.out.println("filepath的值"+filepath);
            if(!filepath.getParentFile().exists()){
                filepath.getParentFile().mkdirs();
            }
            //文件保存到目标文件中
            //document.getFile().transferTo(new File(path+File.separator+filename));
            System.out.println("看看get"+document.getFile());
            document.setFilename(filename);
            model.addAttribute("document",document);
            return "documentquery";
        }else{
            return "error";
        }
    }

    @RequestMapping(value="/download")
    public String download(){
        return "123";
    }
}
