package com.tao.service;

import com.tao.model.DeliverRecord;
import org.apache.commons.fileupload.util.LimitedInputStream;

import java.util.List;

public interface DeliverRecordService {
    boolean addDeliverRecord(DeliverRecord deliverRecord);
    List<DeliverRecord> getNewDeliverRecord();
    DeliverRecord getDeliverById(int id);
    boolean updateDeliverRecord(DeliverRecord deliverRecord);
}
