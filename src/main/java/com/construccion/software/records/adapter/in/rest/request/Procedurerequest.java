package com.construccion.software.records.adapter.in.rest.request;

public class Procedurerequest {

    private String orderNumber;
    private String procedureId;
    private String repetitionNumber;
    private String repetitionFrequency;
    private boolean requiresSpecialistAssistance;
    private String specialistId;
    private String itemId;

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getProcedureId() {
        return procedureId;
    }

    public void setProcedureId(String procedureId) {
        this.procedureId = procedureId;
    }

    public String getRepetitionNumber() {
        return repetitionNumber;
    }

    public void setRepetitionNumber(String repetitionNumber) {
        this.repetitionNumber = repetitionNumber;
    }

    public String getRepetitionFrequency() {
        return repetitionFrequency;
    }

    public void setRepetitionFrequency(String repetitionFrequency) {
        this.repetitionFrequency = repetitionFrequency;
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

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }
}
