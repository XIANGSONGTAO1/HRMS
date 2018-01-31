package com.tao.controller;

import com.tao.model.Visitor;
import com.tao.service.ResumeService;
import com.tao.service.VisitorService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    public String visitorLogin(HttpSession session,String identity,String username,String password){
        System.out.println("??????2");
        System.out.println(identity);
        Visitor visitor=new Visitor();
        visitor.setUsername(username);
        visitor.setPassword(password);
        System.out.println(username);
        System.out.println(password);
        Visitor visitor1=visitorService.getVisitorByNameAndPass(visitor);
        System.out.println(visitor1);
        if (visitor1!=null){
            session.setAttribute("visitor",visitor1);
            return "forward:showRecruit";
        }else {
            System.out.println("kkkk");
            return "redirect:index.jsp";
        }
    }
    @RequestMapping(value="/checkName",method = RequestMethod.POST)
    public @ResponseBody String checkName(String name){
        System.out.println("到checkName");
        System.out.println(name);
        Visitor visitor=new Visitor();
        List<Visitor> visitors=visitorService.getAllVisitor();
        for (Visitor visitor1:visitors){
            if (visitor1.getUsername().equals(name)){
                System.out.println("dskafjldskf");
                return "用户名已存在";
            }
        }
        if (name.equals("")||name==null){
            return "用户名不能为空";
        }
        if(name.contains(" ")){
            return "用户名不能包含空格";
        }
        return "";

    }
    @RequestMapping("/forVisitorRegist")
    public String forVisitorRegist(){
        return "visitorRegist";
    }
    @RequestMapping("/visitorRegist")
    public String visitorRegist(String username,String password){
        Visitor visitor=new Visitor();
        visitor.setUsername(username);
        visitor.setPassword(password);
        visitorService.addVisitor(visitor);
        return "redirect:index.jsp";
    }
}
