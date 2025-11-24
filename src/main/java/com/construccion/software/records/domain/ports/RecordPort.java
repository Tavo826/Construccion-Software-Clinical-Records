package com.construccion.software.records.domain.ports;

import com.construccion.software.records.domain.models.Record;

public interface RecordPort {

    Record findById(long id);
    Record save(Record record);
    Record update(long id, Record record);
    void delete(long id);
}
