package com.tao.controller;

import com.tao.model.Dept;
import com.tao.model.Position;
import com.tao.model.Recruit;
import com.tao.service.DeptService;
import com.tao.service.PositionService;
import com.tao.service.RecruitService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Array;
import java.util.List;

@Controller
public class RecruitController {
    @Resource
    private RecruitService recruitService;
    @Resource
    private DeptService deptService;
    @Resource
    private PositionService positionService;
    @RequestMapping("/showRecruit")
    public String showRecruit(HttpSession session){
        List<Recruit> recruits=recruitService.getAll();
        System.out.println(recruits);
        session.setAttribute("recruits",recruits);
        return "showRecruits";
    }

    @RequestMapping("/showPublishRecruit")
    public ModelAndView showPublishRecruit(Model model, HttpServletRequest request){
        ModelAndView modelAndView=new ModelAndView();
//        List<Dept> depts=deptService.getAllDept();
//        modelAndView.addObject("depts",depts);
//        modelAndView.setViewName("publishRecruit");
        List<Recruit> recruits=recruitService.getAll();
        System.out.println(recruits);
        return modelAndView;
    }

}
