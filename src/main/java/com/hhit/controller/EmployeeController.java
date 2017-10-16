package com.hhit.controller;

import com.hhit.model.Employee;
import com.hhit.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@Controller
@RequestMapping(value="/employee")
public class EmployeeController {

    @Resource
    private EmployeeService employeeService;

    /**
     * 员工信息的全部显示查询
     * @param modelMap 携带集合信息到页面
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/employeequery")
    public String employequery(ModelMap modelMap) throws Exception{
        List<Employee> employeelist;
        employeelist=employeeService.employeeSearchall();
        modelMap.addAttribute("employeelist",employeelist);
        return "employeequery";

    }

    @RequestMapping(value="/deleteemployee")
    public String deleteemp(HttpServletRequest request){
        int id=Integer.valueOf(request.getParameter("id"));
        employeeService.deleteemployee(id);
        return "redirect:/employee/employeequery.action";
    }
}
