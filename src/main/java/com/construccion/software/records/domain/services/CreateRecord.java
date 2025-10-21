package com.construccion.software.records.domain.services;

import com.construccion.software.records.domain.models.Record;
import com.construccion.software.records.domain.ports.RecordPort;
import org.springframework.stereotype.Service;

@Service
public class CreateRecord {

    private final RecordPort recordPort;

    public CreateRecord(RecordPort recordPort) {
        this.recordPort = recordPort;
    }

    public Record create(Record record) {

        return recordPort.save(record);
    }
}
