package com.tao.service;

import com.tao.dao.VisitorMapper;
import com.tao.model.Visitor;

import javax.annotation.Resource;
import java.util.List;

public interface VisitorService {
    List<Visitor> getAllVisitor();
    Visitor getVisitorByNameAndPass(Visitor visitor);
    boolean addVisitor(Visitor visitor);

}
