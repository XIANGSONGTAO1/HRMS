package com.tao.service.impl;

import com.tao.dao.DeliverRecordMapper;
import com.tao.model.DeliverRecord;
import com.tao.service.DeliverRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DeliverRecordServiceImpl implements DeliverRecordService {
    @Resource
    private DeliverRecordMapper deliverRecordMapper;
    @Override
    public boolean addDeliverRecord(DeliverRecord deliverRecord) {
        return deliverRecordMapper.addDeliverRecord(deliverRecord);
    }

    @Override
    public List<DeliverRecord> getNewDeliverRecord() {
        return deliverRecordMapper.getNewDeliverRecord();
    }

    @Override
    public DeliverRecord getDeliverById(int id) {
        return deliverRecordMapper.getDeliverRecordById(id);
    }

    @Override
    public boolean updateDeliverRecord(DeliverRecord deliverRecord) {
        return deliverRecordMapper.updateDeliverRecord(deliverRecord);
    }
}
