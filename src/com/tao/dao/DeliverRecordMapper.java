package com.tao.dao;

import com.tao.model.DeliverRecord;

import java.util.List;

public interface DeliverRecordMapper {
    boolean addDeliverRecord(DeliverRecord deliverRecord);
    List<DeliverRecord> getNewDeliverRecord();
    DeliverRecord getDeliverRecordById(int id);
    boolean updateDeliverRecord(DeliverRecord deliverRecord);
}
