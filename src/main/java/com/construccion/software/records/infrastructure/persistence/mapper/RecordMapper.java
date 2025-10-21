package com.construccion.software.records.infrastructure.persistence.mapper;

import com.construccion.software.records.domain.models.Record;
import com.construccion.software.records.infrastructure.persistence.entities.RecordEntity;

public class RecordMapper {

    public static RecordEntity toEntity(Record record) {

        if (record == null) return null;

        RecordEntity recordEntity = new RecordEntity();
        recordEntity.setName(record.getName());

        return recordEntity;
    }

    public static Record toDomain(RecordEntity entity) {

        if (entity == null) return null;

        Record record = new Record();
        record.setId(entity.getId());
        record.setName(entity.getName());

        return record;
    }
}
