package com.tao.dao;

import com.tao.model.Recruit;

import java.io.Reader;
import java.util.List;

public interface RecruitMapper {
    List<Recruit> getAllRecruit();
    Recruit getOneRecruitById(Recruit recruit);
    boolean deleteRecruit(Recruit recruit);
}
