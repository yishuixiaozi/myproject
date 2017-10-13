package com.hhit.controller;

import com.hhit.model.Employee;
import com.hhit.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@Controller
@RequestMapping(value="/employee")
public class EmployeeController {

    @Resource
    private EmployeeService employeeService;
    @RequestMapping(value="/employeequery")
    public String employequery(ModelMap modelMap) throws Exception{

        Employee emp=new Employee();
        emp.setBithday(new Date());
        System.out.println("日期格式测试"+emp.getBithday());
       /* String dateStr = "Wed Sep 16 11:26:23 CST 2009";
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);

        Date date=(Date)sdf.parse(dateStr);

        String formatStr = new SimpleDateFormat("yyyy-MM-dd").format(date);
        System.out.println(formatStr);

        String formatStr2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
        System.out.println(formatStr2);*/

        List<Employee> employeelist;
        employeelist=employeeService.employeeSearchall();
        modelMap.addAttribute("employeelist",employeelist);
        return "employeequery";

    }
}
