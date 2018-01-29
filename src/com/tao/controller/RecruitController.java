package com.tao.controller;

import com.tao.model.Recruit;
import com.tao.service.RecruitService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class RecruitController {
    @Resource
    private RecruitService recruitService;
    public String showRecruit(HttpSession session){
        List<Recruit> recruits=recruitService.getAll();
        session.setAttribute("recruits",recruits);
        return "showRecruits";
    }
}
