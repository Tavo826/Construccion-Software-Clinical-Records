package com.construccion.software.records.adapter.out;

import com.construccion.software.records.domain.models.Record;
import com.construccion.software.records.domain.ports.RecordPort;
import com.construccion.software.records.infrastructure.persistence.entities.ClinicalRecordEntity;
import com.construccion.software.records.infrastructure.persistence.entities.RecordEntity;
import com.construccion.software.records.infrastructure.persistence.mapper.RecordMapper;
import com.construccion.software.records.infrastructure.persistence.repository.RecordRepository;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

@Service
public class RecordAdapter implements RecordPort {

    private final RecordRepository recordRepository;

    public RecordAdapter(RecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    @Override
    public Record findById(long id) {

        Optional<RecordEntity> recordOptional = recordRepository.findById(id);

        if (recordOptional.isPresent()) {
            RecordEntity recordEntity = recordOptional.get();
            return RecordMapper.toDomain(recordEntity);
        }

        return null;
    }

    @Override
    public Record save(Record record) {

        RecordEntity recordEntity = recordRepository.save(RecordMapper.toEntity(record));

        return RecordMapper.toDomain(recordEntity);
    }

    @Override
    public Record update(long id, Record record) {

        Optional<RecordEntity> recordOptional = recordRepository.findById(id);

        if (recordOptional.isPresent()) {
            RecordEntity recordEntity = recordOptional.get();

            recordEntity.setClinicalRecords(RecordMapper.toEntity(record.getClinicalRecords()));

            RecordEntity updatedRecord = recordRepository.save(recordEntity);
            return RecordMapper.toDomain(updatedRecord);
        }

        return null;
    }

    @Override
    public void delete(long id) {

        recordRepository.deleteById(id);
    }
}
