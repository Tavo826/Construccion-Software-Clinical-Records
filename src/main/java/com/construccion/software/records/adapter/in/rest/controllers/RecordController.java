package com.construccion.software.records.adapter.in.rest.controllers;

import com.construccion.software.records.adapter.in.builder.RecordBuilder;
import com.construccion.software.records.adapter.in.rest.request.RecordRequest;
import com.construccion.software.records.adapter.in.validators.RecordValidator;
import com.construccion.software.records.application.usecases.RecordUseCase;
import com.construccion.software.records.domain.models.Record;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RecordController {

    private final RecordBuilder recordBuilder;
    private final RecordValidator recordValidator;
    private final RecordUseCase recordUseCase;

    public RecordController(RecordBuilder recordBuilder, RecordValidator recordValidator, RecordUseCase recordUseCase) {
        this.recordBuilder = recordBuilder;
        this.recordValidator = recordValidator;
        this.recordUseCase = recordUseCase;
    }

    @GetMapping("/Records/{id}")
    public ResponseEntity<?> getRecordById(@PathVariable String id) throws Exception {

        Record record = recordUseCase.getRecordById(recordBuilder.getId(id));

        return ResponseEntity.ok(record);

    }

    @PostMapping("/Records")
    public ResponseEntity<?> createRecord(@RequestBody RecordRequest request) throws Exception {

        Record record = recordBuilder.build(
                request.getName()
        );

        Record createdRecord = recordUseCase.createRecord(record);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(createdRecord);
    }

    @PatchMapping("/Records/{id}")
    public ResponseEntity<?> updateRecord(@PathVariable String id, @RequestBody RecordRequest request) throws Exception {

        Record record = recordBuilder.build(
                request.getName()
        );

        Record updatedOrder = recordUseCase.updateRecord(recordBuilder.getId(id), record);

        return ResponseEntity.ok(updatedOrder);
    }

    @DeleteMapping("Records/{id}")
    public ResponseEntity<?> deleteRecord(@PathVariable String id) throws Exception {

        recordUseCase.deleteRecord(recordBuilder.getId(id));

        return ResponseEntity.noContent().build();
    }
}
