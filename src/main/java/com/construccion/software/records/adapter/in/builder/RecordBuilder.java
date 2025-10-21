package com.construccion.software.records.adapter.in.builder;

import com.construccion.software.records.adapter.in.validators.RecordValidator;
import com.construccion.software.records.domain.models.Record;
import org.springframework.stereotype.Component;

@Component
public class RecordBuilder {

    private final RecordValidator recordValidator;

    public RecordBuilder(RecordValidator recordValidator) {
        this.recordValidator = recordValidator;
    }

    public Record build(String name) throws Exception {

        Record record = new Record();
        record.setName(recordValidator.nameValidator(name));

        return record;
    }

    public String getId(String id) throws Exception {

        return recordValidator.idValidator(id);
    }
}
