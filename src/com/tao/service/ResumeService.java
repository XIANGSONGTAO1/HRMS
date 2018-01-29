package com.tao.service;

import com.tao.model.Resume;

import java.util.List;

public interface ResumeService {
    boolean addResume(Resume resume);
    List<Resume> getAll();
}
