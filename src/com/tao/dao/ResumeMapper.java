package com.tao.dao;

import com.tao.model.Resume;

import java.util.List;

public interface ResumeMapper {
    boolean addResume(Resume resume);
    List<Resume> getAll();
}