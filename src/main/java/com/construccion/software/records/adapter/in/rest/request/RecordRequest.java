package com.construccion.software.records.adapter.in.rest.request;

import java.util.List;

public class RecordRequest {

    private String documentId;
    private String date;
    private String employeeId;
    private String reason;
    private String symptomatology;
    private String diagnosis;
    private List<MedicineRequest> medicineList;
    private List<Procedurerequest> procedureList;
    private List<DiagnosticAssistanceRequest> diagnosticAssistanceList;

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getSymptomatology() {
        return symptomatology;
    }

    public void setSymptomatology(String symptomatology) {
        this.symptomatology = symptomatology;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public List<MedicineRequest> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(List<MedicineRequest> medicineList) {
        this.medicineList = medicineList;
    }

    public List<Procedurerequest> getProcedureList() {
        return procedureList;
    }

    public void setProcedureList(List<Procedurerequest> procedureList) {
        this.procedureList = procedureList;
    }

    public List<DiagnosticAssistanceRequest> getDiagnosticAssistanceList() {
        return diagnosticAssistanceList;
    }

    public void setDiagnosticAssistanceRequestList(List<DiagnosticAssistanceRequest> diagnosticAssistanceList) {
        this.diagnosticAssistanceList = diagnosticAssistanceList;
    }
}
