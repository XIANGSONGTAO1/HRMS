package com.tao.service.impl;

import com.tao.dao.PositionMapper;
import com.tao.model.Dept;
import com.tao.model.Position;
import com.tao.service.PositionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class PositionServiceImpl implements PositionService {
    @Resource
    private PositionMapper positionMapper;
    @Override
    public List<Position> getAllByDid(int did) {
        return positionMapper.getAllByDid(did);
    }
}
