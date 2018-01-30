package com.tao.service.impl;

import com.tao.dao.ResumeMapper;
import com.tao.model.Resume;
import com.tao.service.ResumeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ResumeServiceImpl implements ResumeService {
    @Resource
    private ResumeMapper resumeMapper;
    @Override
    public boolean addResume(Resume resume) {
        return resumeMapper.addResume(resume);
    }

    @Override
    public List<Resume> getAll() {
        return null;
    }

    @Override
    public List<Resume> getAllByVid(int v_id) {
        return resumeMapper.getResumeByVid(v_id);
    }

    @Override
    public Resume getResumeById(int id) {
        return resumeMapper.getResumeById(id);
    }
}
