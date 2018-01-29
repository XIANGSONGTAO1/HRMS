package com.tao.service.impl;

import com.tao.dao.DeptMapper;
import com.tao.model.Dept;
import com.tao.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class DeptServiceImpl implements DeptService {
    @Resource
    private DeptMapper deptMapper;
    @Override
    public List<Dept> getAllDept() {
        return deptMapper.getAll();
    }
}
