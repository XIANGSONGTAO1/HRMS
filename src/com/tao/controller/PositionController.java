package com.tao.controller;

import com.tao.model.Dept;
import com.tao.model.Position;
import com.tao.service.PositionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class PositionController {
    @Resource
    private PositionService positionService;
    @RequestMapping("/getPositionByDept")

    public @ResponseBody List<Position> getPositionByDept(int d){
        System.out.println("µ½getPositionByDept");
        Dept dept=new Dept();
        dept.setId(d);
        System.out.println(d);
        List<Position> positions=positionService.getAllByDid(d);
        System.out.println(positions);
        return positions;
    }
}
