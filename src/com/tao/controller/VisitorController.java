package com.tao.controller;

import com.tao.model.Visitor;
import com.tao.service.ResumeService;
import com.tao.service.VisitorService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class VisitorController {
    @Resource
    private VisitorService visitorService;
    @Resource
    private ResumeService resumeService;
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
    @RequestMapping("/checkName")
    public @ResponseBody String checkName(String name){
        Visitor visitor=new Visitor();
        List<Visitor> visitors=visitorService.getAllVisitor();
        for (Visitor visitor1:visitors){
            if (visitor1.getUsername().equals(name)){
                return "用户名已经存在";
            }
        }
        if (name.equals("")){
            return "用户名不能为空";
        }
        return "";
    }
    @RequestMapping("/deliverResume")
    public String deliverResume(){
        resumeService
    }
}
