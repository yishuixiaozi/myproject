package com.hhit.service.impl;

import com.hhit.dao.EmployeeDao;
import com.hhit.model.Employee;
import com.hhit.service.EmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value="employeeservice")
public class EmployeeServiceImpl implements EmployeeService {
    @Resource
    EmployeeDao employeeDao;
    @Override
    public List<Employee> employeeSearchall() {
        return employeeDao.employeeSearchall();
    }
}
