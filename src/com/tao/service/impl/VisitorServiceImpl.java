package com.tao.service.impl;

import com.tao.dao.VisitorMapper;
import com.tao.model.Visitor;
import com.tao.service.VisitorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class VisitorServiceImpl implements VisitorService {
    @Resource
    private VisitorMapper visitorMapper;
    @Override
    public List<Visitor> getAllVisitor() {
        return visitorMapper.getAllVisitor();
    }

    @Override
    public Visitor getVisitorByNameAndPass(Visitor visitor) {
        return visitorMapper.getByNameAndPass(visitor);
    }

    @Override
    public boolean addVisitor(Visitor visitor) {
        return visitorMapper.addVisitor(visitor);
    }
}
