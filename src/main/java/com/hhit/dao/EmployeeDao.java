package com.hhit.dao;

import com.hhit.model.Employee;

import java.util.List;

public interface EmployeeDao {
    List<Employee> employeeSearchall();

    void deleteempoyee(int id);

    void addemployee(Employee employee);
}
