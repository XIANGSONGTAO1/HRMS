package com.tao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UtilController {
    @RequestMapping("/checkIdentity")
    public String checkIdentity(String identity){
        if (identity.equals("admin")){
            return "forward:adminLogin";
        }else if (identity.equals("visitor")){
            return "forward:visitorLogin";
        }else{
            return "forward:employeeLogin";
        }
    }
}
