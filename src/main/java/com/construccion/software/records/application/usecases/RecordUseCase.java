package com.construccion.software.records.application.usecases;

import com.construccion.software.records.domain.models.Record;
import com.construccion.software.records.domain.services.CreateRecord;
import com.construccion.software.records.domain.services.DeleteRecord;
import com.construccion.software.records.domain.services.GetRecord;
import com.construccion.software.records.domain.services.UpdateRecord;
import org.springframework.stereotype.Service;

@Service
public class RecordUseCase {

    private final GetRecord getRecord;
    private final CreateRecord createRecord;
    private final UpdateRecord updateRecord;
    private final DeleteRecord deleteRecord;

    public RecordUseCase(
            GetRecord getRecord,
            CreateRecord createRecord,
            UpdateRecord updateRecord,
            DeleteRecord deleteRecord) {
        this.getRecord = getRecord;
        this.createRecord = createRecord;
        this.updateRecord = updateRecord;
        this.deleteRecord = deleteRecord;
    }

    public Record getRecordById(String id) throws Exception {

        return getRecord.getById(id);
    }

    public Record createRecord(Record record) {

        return createRecord.create(record);
    }

    public Record updateRecord(String id, Record record) throws Exception {

        return updateRecord.update(id, record);
    }

    public void deleteRecord(String id) throws Exception {

        deleteRecord.delete(id);
    }
}
