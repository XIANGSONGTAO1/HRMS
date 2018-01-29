package com.tao.dao;

import com.tao.model.Dept;
import com.tao.model.Position;

import java.util.List;

public interface PositionMapper {
    List<Position> getAllByDid(Dept dept);
}
