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

    /**
     * 员工的删除
     * @param request
     * @return
     */
    @RequestMapping(value="/deleteemployee")
    public String deleteemp(HttpServletRequest request){
        int id=Integer.valueOf(request.getParameter("id"));
        employeeService.deleteemployee(id);
        return "redirect:/employee/employeequery.action";
    }

    @RequestMapping(value="/addemp")
    public String addemp(Employee employee){
        //System.out.println("获取jobid"+employee.getJobid());
        //System.out.println("获取部门dept_id"+employee.getDeptid());
        //System.out.println("获取性别"+employee.getSex());
        int job_id=Integer.parseInt(employee.getJobid());
        int dept_id=Integer.parseInt(employee.getDeptid());
        employee.setJob_id(job_id);
        employee.setDept_id(dept_id);
        employeeService.addemployee(employee);
        return "redirect:/employee/employeequery.action";
    }

    @RequestMapping(value="/updateemployee")
    public String updateemployee(Employee employee){
        int job_id=Integer.parseInt(employee.getJobid());
        int dept_id=Integer.parseInt(employee.getDeptid());
        employee.setJob_id(job_id);
        employee.setDept_id(dept_id);
        employeeService.updateemployee(employee);
        return "redirect:/employee/employeequery.action";
    }
}
