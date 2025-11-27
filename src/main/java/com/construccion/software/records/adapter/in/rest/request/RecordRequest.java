package com.construccion.software.records.adapter.in.rest.request;

import java.util.List;
import java.util.Map;

public class RecordRequest {

    private String documentId;
    private Map<String, ClinicalRecordRequest> clinicalRecords;

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public Map<String, ClinicalRecordRequest> getClinicalRecords() {
        return clinicalRecords;
    }

    public void setClinicalRecords(Map<String, ClinicalRecordRequest> clinicalRecords) {
        this.clinicalRecords = clinicalRecords;
    }
}
