package com.tao.service.impl;

import com.tao.dao.RecruitMapper;
import com.tao.model.Recruit;
import com.tao.service.RecruitService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class RecruitServiceImpl implements RecruitService {
    @Resource
    private RecruitMapper recruitMapper;
    @Override
    public List<Recruit> getAll() {
        return recruitMapper.getAllRecruit();
    }
}
