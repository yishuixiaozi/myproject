package com.hhit.service;

import com.hhit.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> employeeSearchall();

    void deleteemployee(int id);

    void addemployee(Employee employee);

    void updateemployee(Employee employee);
}
