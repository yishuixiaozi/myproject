package com.hhit.controller;
import com.hhit.model.Dept;
import com.hhit.service.DeptService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
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
}
