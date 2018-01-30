package com.tao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UtilController {
    @RequestMapping("/checkIdentity")
    public String checkIdentity(String identity,String username,String password){
        System.out.println("µΩ’‚¡À1");
        System.out.println(identity);
        if (identity.equals("admin")){
            return "forward:adminLogin";
        }else if (identity.equals("visitor")){
            return "forward:visitorLogin";
        }else{
            return "forward:employeeLogin";
        }
    }
}
