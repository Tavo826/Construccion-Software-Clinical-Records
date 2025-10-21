package com.construccion.software.records.domain.ports;

import com.construccion.software.records.domain.models.Record;

public interface RecordPort {

    public Record findById(String id);
    public Record save(Record record);
    public Record update(String id, Record record);
    public void delete(String id);
}
