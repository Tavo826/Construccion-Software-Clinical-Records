package com.construccion.software.records.domain.models;

public class DiagnosticAssistance {

    private String orderNumber;
    private String diagnosticAssistanceId;
    private String quantity;
    private long itemId;
    private boolean requiresSpecialistAssistance;
    private long specialistId;

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

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public boolean isRequiresSpecialistAssistance() {
        return requiresSpecialistAssistance;
    }

    public void setRequiresSpecialistAssistance(boolean requiresSpecialistAssistance) {
        this.requiresSpecialistAssistance = requiresSpecialistAssistance;
    }

    public long getSpecialistId() {
        return specialistId;
    }

    public void setSpecialistId(long specialistId) {
        this.specialistId = specialistId;
    }
}
