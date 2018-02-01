package com.tao.controller;

import com.tao.service.PositionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class PositionController {
    @Resource
    private PositionService positionService;
    @RequestMapping("/getPositionByDept")
    public String getPositionByDept(String d){
        System.out.println("µ½getPositionByDept");
        System.out.println(d);
        return "";
    }
}
