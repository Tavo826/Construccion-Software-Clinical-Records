package com.construccion.software.records.adapter.in.rest.request;

import java.util.List;

public class ClinicalRecordRequest {

    private String employeeId;
    private String reason;
    private String symptomatology;
    private String diagnosis;
    private List<MedicineRequest> medicationList;
    private List<ProcedureRequest> procedureList;
    private List<DiagnosticAssistanceRequest> diagnosticAssistanceList;

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

    public List<MedicineRequest> getMedicationList() {
        return medicationList;
    }

    public void setMedicationList(List<MedicineRequest> medicationList) {
        this.medicationList = medicationList;
    }

    public List<ProcedureRequest> getProcedureList() {
        return procedureList;
    }

    public void setProcedureList(List<ProcedureRequest> procedureList) {
        this.procedureList = procedureList;
    }

    public List<DiagnosticAssistanceRequest> getDiagnosticAssistanceList() {
        return diagnosticAssistanceList;
    }

    public void setDiagnosticAssistanceList(List<DiagnosticAssistanceRequest> diagnosticAssistanceList) {
        this.diagnosticAssistanceList = diagnosticAssistanceList;
    }
}
