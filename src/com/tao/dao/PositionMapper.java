package com.tao.dao;

import com.tao.model.Dept;
import com.tao.model.Position;
import javafx.geometry.Pos;

import java.util.List;

public interface PositionMapper {
    List<Position> getAllByDid(int did);
    Position getById(int id);
}
