package com.tao.controller;

import com.tao.model.DeliverRecord;
import com.tao.model.Recruit;
import com.tao.model.Resume;
import com.tao.model.Visitor;
import com.tao.service.DeliverRecordService;
import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
@Controller
public class DeliverRecordController {
    @Resource
    private DeliverRecordService deliverRecordService;
    @RequestMapping("/deliverResume")
    public String deliverResume(int resumeId,HttpSession session){
        System.out.println("到deliverresume");
        //System.out.println(rc_id);
        System.out.println(resumeId);
        int rc_id= (int) session.getAttribute("rc_id");
        System.out.println(rc_id);
        Visitor visitor= (Visitor) session.getAttribute("visitor");
        Recruit recruit=new Recruit();
        recruit.setId(rc_id);
        Resume resume=new Resume();
        resume.setId(resumeId);
        DeliverRecord deliverRecord=new DeliverRecord();
        deliverRecord.setRecruit(recruit);
        deliverRecord.setResume(resume);
        deliverRecord.setVisitor(visitor);
        Date date=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1=dateFormat.format(date);
        deliverRecord.setDilivertime(date1);
        deliverRecord.setStatus(0);
        deliverRecordService.addDeliverRecord(deliverRecord);
        return "forward:showRecruit";
    }
    @RequestMapping("/showNewDeliverRecord")
    public String showNewDeliverRecord(Model model){
        System.out.println("到showNewDeliverRecord");
        List<DeliverRecord> deliverRecords=deliverRecordService.getNewDeliverRecord();
        model.addAttribute("dl",deliverRecords);
        System.out.println(deliverRecords);
        return "showNewDeliverRecord";
    }
    @RequestMapping("/interviewInvitation")
    public String interviewInvitation(String dlId,String interviewTime,String interviewPlace){
        System.out.println("到interviewInvitation");
        int dlId1= Integer.parseInt(dlId);
        System.out.println(dlId1);
        //deliverRecordService
        DeliverRecord deliverRecord=deliverRecordService.getDeliverById(dlId1);
        deliverRecord.setStatus(1);
        deliverRecord.setInterviewtime(interviewTime);
        deliverRecord.setInterviewplace(interviewPlace);
        deliverRecordService.updateDeliverRecord(deliverRecord);
        System.out.println(deliverRecord);
        return "adminLoginSuccess";
    }
    @RequestMapping("/dontSendInvitation")
    public String dontSendInvitation(String dlId){
        int dlId1= Integer.parseInt(dlId);
        DeliverRecord deliverRecord=deliverRecordService.getDeliverById(dlId1);
        deliverRecord.setStatus(-1);
        return "forward:showNewDeliverRecord";
    }
    @RequestMapping("/beginInterview")
    public String beginInterview(Model model){
        System.out.println("到beginInterview");
        List<DeliverRecord> deliverRecords=deliverRecordService.getInterviewDelivers();
        model.addAttribute("bi",deliverRecords);
        return "showDeliverRecordsInterview";
    }
    @RequestMapping("/refuseHire")
    public String refuseHire(String dlId){
        int dlId1= Integer.parseInt(dlId);
        DeliverRecord deliverRecord=deliverRecordService.getDeliverById(dlId1);
        deliverRecord.setStatus(-2);
        deliverRecordService.updateDeliverRecord(deliverRecord);
        return "forward:beginInterview";
    }
    @RequestMapping("/showSelfDeliverRecord")
    public String showSelfDeliverRecord(HttpSession session,Model model){
        Visitor visitor= (Visitor) session.getAttribute("visitor");
        System.out.println("到showSelfDeliverRecord");
        System.out.println(visitor);
        List<DeliverRecord> deliverRecords=deliverRecordService.getSelfDeliverRecord(visitor.getId());
        model.addAttribute("dr",deliverRecords);
        return "showSelfDeliverRecord";
    }
}
