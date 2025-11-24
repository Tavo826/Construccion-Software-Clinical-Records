package com.construccion.software.records.adapter.in.rest.request;

public class DiagnosticAssistanceRequest {

    private String orderNumber;
    private String diagnosticAssistanceId;
    private String quantity;
    private String itemId;
    private boolean requiresSpecialistAssistance;
    private String specialistId;

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getDiagnosticAssistanceId() {
        return diagnosticAssistanceId;
    }

    public void setDiagnosticAssistanceId(String diagnosticAssistanceId) {
        this.diagnosticAssistanceId = diagnosticAssistanceId;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public boolean isRequiresSpecialistAssistance() {
        return requiresSpecialistAssistance;
    }

    public void setRequiresSpecialistAssistance(boolean requiresSpecialistAssistance) {
        this.requiresSpecialistAssistance = requiresSpecialistAssistance;
    }

    public String getSpecialistId() {
        return specialistId;
    }

    public void setSpecialistId(String specialistId) {
        this.specialistId = specialistId;
    }
}
