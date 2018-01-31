package com.tao.dao;

import com.tao.model.Visitor;

import java.util.List;

public interface VisitorMapper {
    Visitor getByNameAndPass(Visitor visitor);
    boolean addVisitor(Visitor visitor);
    List<Visitor> getAllVisitor();
    Visitor getVisitorById(Visitor visitor);
}
