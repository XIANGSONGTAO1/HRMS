package com.tao.controller;

import com.tao.model.Dept;
import com.tao.service.DeptService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UtilController {
    @Resource
    private DeptService deptService;
    @RequestMapping("/checkIdentity")
    public String checkIdentity(String identity,String username,String password){
        System.out.println("到这了1");
        System.out.println(identity);
        if (identity.equals("admin")){
            return "forward:adminLogin";
        }else if (identity.equals("visitor")){
            return "forward:visitorLogin";
        }else{
            return "forward:employeeLogin";
        }
    }
    @RequestMapping("/adminLogin")
    public String adminLogin(String username,String password){
        if (username.equals("admin")&&password.equals("admin")){
            return "adminLoginSuccess";
        }
        return "redirect:index.jsp";
    }
    @RequestMapping("/forAddRecruit")
    public String forAddRecruit(Model model){
        System.out.println("到forAddRecruit");
        List<Dept> depts=deptService.getAllDept();
        model.addAttribute("depts",depts);
        System.out.println(depts);
        return "addRecruit";
    }
}
