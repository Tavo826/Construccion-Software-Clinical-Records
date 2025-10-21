package com.construccion.software.records.infrastructure.persistence.repository;

import com.construccion.software.records.infrastructure.persistence.entities.RecordEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends CrudRepository<RecordEntity, String> {
}
