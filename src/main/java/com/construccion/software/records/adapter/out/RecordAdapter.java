package com.construccion.software.records.adapter.out;

import com.construccion.software.records.domain.models.Record;
import com.construccion.software.records.domain.ports.RecordPort;
import com.construccion.software.records.infrastructure.persistence.entities.RecordEntity;
import com.construccion.software.records.infrastructure.persistence.mapper.RecordMapper;
import com.construccion.software.records.infrastructure.persistence.repository.RecordRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RecordAdapter implements RecordPort {

    private final RecordRepository recordRepository;

    public RecordAdapter(RecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    @Override
    public Record findById(String id) {

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
    public Record update(String id, Record record) {

        Optional<RecordEntity> recordOptional = recordRepository.findById(id);

        if (recordOptional.isPresent()) {
            RecordEntity recordEntity = recordOptional.get();

            recordEntity.setName(record.getName());

            RecordEntity updatedRecord = recordRepository.save(recordEntity);
            return RecordMapper.toDomain(updatedRecord);
        }

        return null;
    }

    @Override
    public void delete(String id) {

        recordRepository.deleteById(id);
    }
}
