package com.tao.service.impl;

import com.tao.dao.RecruitMapper;
import com.tao.model.Recruit;
import com.tao.service.RecruitService;

import java.util.List;

public class RecruitServiceImpl implements RecruitService {
    private RecruitMapper recruitMapper;
    @Override
    public List<Recruit> getAll() {
        return recruitMapper.getAllRecruit();
    }
}
