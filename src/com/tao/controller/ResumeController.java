package com.tao.controller;

import com.tao.model.Resume;
import com.tao.service.ResumeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class ResumeController {
    @Resource
    private ResumeService resumeService;
    @RequestMapping("/addResume")
    public String addResume(Resume resume){
        resumeService.addResume(resume);
        return "showRecruit";
    }
}
