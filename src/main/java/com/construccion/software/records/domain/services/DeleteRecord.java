package com.construccion.software.records.domain.services;

import com.construccion.software.records.application.exceptions.RecordNotFoundException;
import com.construccion.software.records.domain.ports.RecordPort;
import org.springframework.stereotype.Service;

@Service
public class DeleteRecord {

    private final RecordPort recordPort;

    public DeleteRecord(RecordPort recordPort) {
        this.recordPort = recordPort;
    }

    public void delete(long id) throws Exception {

        if (recordPort.findById(id) == null) {
            throw new RecordNotFoundException("No existe una orden con id: " + id);
        }

        recordPort.delete(id);
    }
}
