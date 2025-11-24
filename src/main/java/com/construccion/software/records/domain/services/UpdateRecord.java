package com.construccion.software.records.domain.services;

import com.construccion.software.records.application.exceptions.RecordNotFoundException;
import com.construccion.software.records.domain.models.Record;
import com.construccion.software.records.domain.ports.RecordPort;
import org.springframework.stereotype.Service;

@Service
public class UpdateRecord {

    private final RecordPort recordPort;

    public UpdateRecord(RecordPort recordPort) {
        this.recordPort = recordPort;
    }

    public Record update(long id, Record record) throws Exception {

         Record updatedRecord = recordPort.update(id, record);
        if (updatedRecord == null) {
            throw new RecordNotFoundException("no existe un historial con ese id");
        }

        return updatedRecord;
    }
}
