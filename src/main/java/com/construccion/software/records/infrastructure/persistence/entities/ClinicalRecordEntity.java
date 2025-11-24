package com.construccion.software.records.infrastructure.persistence.entities;

import java.util.List;

public class ClinicalRecordEntity {

    private long employeeId;
    private String reason;
    private String symptomatology;
    private String diagnosis;
    private List<MedicineEntity> medicationList;
    private List<ProcedureEntity> procedureList;
    private List<DiagnosticAssistanceEntity> diagnosticAssistanceList;

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
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

    public List<MedicineEntity> getMedicationList() {
        return medicationList;
    }

    public void setMedicationList(List<MedicineEntity> medicationList) {
        this.medicationList = medicationList;
    }

    public List<ProcedureEntity> getProcedureList() {
        return procedureList;
    }

    public void setProcedureList(List<ProcedureEntity> procedureList) {
        this.procedureList = procedureList;
    }

    public List<DiagnosticAssistanceEntity> getDiagnosticAssistanceList() {
        return diagnosticAssistanceList;
    }

    public void setDiagnosticAssistanceList(List<DiagnosticAssistanceEntity> diagnosticAssistanceList) {
        this.diagnosticAssistanceList = diagnosticAssistanceList;
    }
}
