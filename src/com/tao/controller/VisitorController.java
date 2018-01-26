package com.tao.controller;

import com.tao.model.Visitor;
import com.tao.service.VisitorService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class VisitorController {
    @Resource
    private VisitorService visitorService;
    @RequestMapping("/visitorLogin")
    public String visitorLogin(Visitor visitor,HttpSession session){
        Visitor visitor1=visitorService.getVisitorByNameAndPass(visitor);
        if (visitor1!=null){
            session.setAttribute("visitor",visitor1);
            return "showRecruit";
        }else {
            return "redirect:../index.jsp";
        }
    }

}
