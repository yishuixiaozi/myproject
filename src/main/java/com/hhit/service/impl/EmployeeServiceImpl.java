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

    @Override
    public void deleteemployee(int id) {
        employeeDao.deleteempoyee(id);
    }

    @Override
    public void addemployee(Employee employee) {
        employeeDao.addemployee(employee);
    }

    @Override
    public void updateemployee(Employee employee) {
        employeeDao.updateemployee(employee);
    }
}
