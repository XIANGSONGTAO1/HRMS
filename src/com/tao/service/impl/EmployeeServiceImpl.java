package com.tao.service.impl;

import com.tao.dao.EmployeeMapper;
import com.tao.model.Employee;
import com.tao.service.EmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Resource
    private EmployeeMapper employeeMapper;
    @Override
    public boolean addEmployee(Employee employee) {
        return employeeMapper.addEmployee(employee);
    }

    @Override
    public Employee getEmployeeByNameAndPassword(Employee employee) {
        return employeeMapper.getEmployeeByUserNameAndPassword(employee);
    }
}
