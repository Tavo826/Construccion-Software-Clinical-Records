package com.construccion.software.records.infrastructure.persistence.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;

@Document(collection = "records")
public class RecordEntity {

    @Id
    private long documentId;
    private Map<String, ClinicalRecordEntity> clinicalRecords;

    public long getDocumentId() {
        return documentId;
    }

    public void setDocumentId(long documentId) {
        this.documentId = documentId;
    }

    public Map<String, ClinicalRecordEntity> getClinicalRecords() {
        return clinicalRecords;
    }

    public void setClinicalRecords(Map<String, ClinicalRecordEntity> clinicalRecords) {
        this.clinicalRecords = clinicalRecords;
    }
}
