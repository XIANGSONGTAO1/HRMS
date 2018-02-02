package com.tao.dao;

import com.tao.model.Employee;

public interface EmployeeMapper {
    boolean addEmployee(Employee employee);
    Employee getEmployeeByUserNameAndPassword(Employee employee);

}
