package com.construccion.software.records.domain.services;

import com.construccion.software.records.application.exceptions.RecordNotFoundException;
import com.construccion.software.records.domain.models.Record;
import com.construccion.software.records.domain.ports.RecordPort;
import org.springframework.stereotype.Service;

@Service
public class GetRecord {

    private final RecordPort recordPort;

    public GetRecord(RecordPort recordPort) {
        this.recordPort = recordPort;
    }

    public Record getById(long id) throws Exception {

        Record record = recordPort.findById(id);
        if (record == null) {
            throw new RecordNotFoundException("no existe un historial con ese id");
        }

        return record;
    }
}
