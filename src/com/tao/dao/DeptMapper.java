package com.tao.dao;

import com.tao.model.Dept;

import java.util.List;

public interface DeptMapper {
    List<Dept> getAll();
    Dept getById(Dept dept);
    boolean delete(Dept dept);
}
