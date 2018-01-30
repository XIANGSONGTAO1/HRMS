package com.tao.controller;

import com.tao.model.Resume;
import com.tao.model.Visitor;
import com.tao.service.ResumeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ResumeController {
    @Resource
    private ResumeService resumeService;
    @RequestMapping("/addResume")
    public String addResume(Resume resume,HttpSession session){
        System.out.println("µ½addResume");
        Visitor visitor= (Visitor) session.getAttribute("visitor");
        resume.setVisitor(visitor);
        System.out.println(resume);
        resumeService.addResume(resume);
        return "forward:showRecruit";
    }
    @RequestMapping("/chooseResume")
    public String chooseResume(HttpSession session, int rc_id, HttpServletRequest request){
        System.out.println("µ½chooseresume");
        System.out.println(rc_id);
        Visitor visitor= (Visitor) session.getAttribute("visitor");
        System.out.println(visitor);
        List<Resume> resumes=resumeService.getAllByVid(visitor.getId());
        System.out.println(resumes);
        session.setAttribute("resumes",resumes);
        session.setAttribute("rc_id",rc_id);
        //System.out.println(resumes);
        return "chooseResume";
    }
    @RequestMapping("/forAddResume")
    public String forAddResume(){
        return "addResume";
    }
    @RequestMapping("/showResumeById")
    public String showResumeById(String resumeId, Model model){
        int resumeId1= Integer.parseInt(resumeId);
        System.out.println("µ½showResume");
        Resume resume=resumeService.getResumeById(resumeId1);
        System.out.println(resume);
        model.addAttribute("r",resume);
        return "showOneResume";
    }
}
