package com.tao.service;

import com.tao.model.Dept;
import com.tao.model.Position;

import java.util.List;

public interface PositionService {
    List<Position> getAllByDid(int did);
}
