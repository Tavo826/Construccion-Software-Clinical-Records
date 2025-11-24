package com.construccion.software.records.domain.models;

import com.construccion.software.records.infrastructure.persistence.entities.DiagnosticAssistanceEntity;

import java.util.List;

public class ClinicalRecord {

    private long employeeId;
    private String reason;
    private String symptomatology;
    private String diagnosis;
    private List<Medicine> medicationList;
    private List<Procedure> procedureList;
    private List<DiagnosticAssistance> diagnosticAssistanceList;

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

    public List<Medicine> getMedicationList() {
        return medicationList;
    }

    public void setMedicationList(List<Medicine> medicationList) {
        this.medicationList = medicationList;
    }

    public List<Procedure> getProcedureList() {
        return procedureList;
    }

    public void setProcedureList(List<Procedure> procedureList) {
        this.procedureList = procedureList;
    }

    public List<DiagnosticAssistance> getDiagnosticAssistanceList() {
        return diagnosticAssistanceList;
    }

    public void setDiagnosticAssistanceList(List<DiagnosticAssistance> diagnosticAssistanceList) {
        this.diagnosticAssistanceList = diagnosticAssistanceList;
    }
}
