package com.hhit.controller;
import com.hhit.model.Dept;
import com.hhit.service.DeptService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
@Controller
@RequestMapping(value="/dept")
public class DeptController {
    @Resource
    private DeptService deptService;
    /**
     * 用户所有表的信息集合查询
     * @param modelMap 存储集合信息
     * @return
     */
    @RequestMapping(value="/deptquery")
    public String deptquery(ModelMap modelMap){
        List<Dept> deptlist;
        deptlist=deptService.deptSearchall();
        modelMap.addAttribute("deptlist",deptlist);
        return "deptquery";
    }

    /**
     * 删除职位
     * @param request
     * @return
     */
    @RequestMapping(value="/deletedept")
    public String deletedept1(HttpServletRequest request){
        System.out.println("111111111职位删除");
        int id=Integer.valueOf(request.getParameter("id"));
        deptService.deletedept(id);
        return "redirect:/dept/deptquery.action";
    }

    /**
     * 部门添加
     * @param dept
     * @return
     */
    @RequestMapping(value="/adddept")
    public String adddept(Dept dept){
        deptService.adddept(dept);
        return "redirect:/dept/deptquery.action";
    }

    /**
     * 修改部门
     * @param dept
     * @return
     */
    @RequestMapping(value="/updatedept")
    public String updatedept(Dept dept){
        deptService.updatedept(dept);
        return "redirect:/dept/deptquery.action";
    }


}
