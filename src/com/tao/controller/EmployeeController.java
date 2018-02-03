package com.tao.controller;

import com.tao.model.Employee;
import com.tao.model.Position;
import com.tao.service.EmployeeService;
import com.tao.service.PositionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class EmployeeController {
    @Resource
    private EmployeeService employeeService;
    @Resource
    private PositionService positionService;
    @RequestMapping("/addEmployee")
    public String addEmployee(String email,String tel,String trueName,int positionId,String userName,String password,String sex,int age){
        Position position=positionService.getById(positionId);
        System.out.println(positionId);
        System.out.println(position);
        Employee employee=new Employee();
        employee.setPassword(password);
        employee.setSalary(position.getSalary()*0.5);
        employee.setTruename(trueName);
        employee.setUsername(userName);
        employee.setPositionId(positionId);
        employee.setSex(sex);
        employee.setAge(age);
        employee.setStatus(0);
        employee.setEmail(email);
        employee.setTel(tel);
        employeeService.addEmployee(employee);
        return "";
    }
    @RequestMapping("/employeeLogin")
    public String employeeLogin(String username,String password){

    }
}
