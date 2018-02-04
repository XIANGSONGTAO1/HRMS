package com.tao.service;

import com.tao.model.Employee;

public interface EmployeeService {
    boolean addEmployee(Employee employee);
    Employee getEmployeeByNameAndPassword(Employee employee);
}
