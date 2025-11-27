package com.construccion.software.records.adapter.in.builder;

import com.construccion.software.records.adapter.in.rest.request.ClinicalRecordRequest;
import com.construccion.software.records.adapter.in.rest.request.RecordRequest;
import com.construccion.software.records.adapter.in.validators.RecordValidator;
import com.construccion.software.records.domain.models.*;
import com.construccion.software.records.domain.models.Record;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class RecordBuilder {

    private final RecordValidator recordValidator;

    public RecordBuilder(RecordValidator recordValidator) {
        this.recordValidator = recordValidator;
    }

    public Record build(RecordRequest request) throws Exception {

        Record record = new Record();
        record.setDocumentId(recordValidator.documentValidator(request.getDocumentId()));

        if (request.getClinicalRecords() != null) {
            Map<String, ClinicalRecord> clinicalRecords = new HashMap<>();
            request.getClinicalRecords().forEach((key, value) -> {
                try {
                    clinicalRecords.put(key, buildClinicalRecord(value));
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            });
            record.setClinicalRecords(clinicalRecords);
        }

        return record;
    }

    private ClinicalRecord buildClinicalRecord(ClinicalRecordRequest request) throws Exception {

        List<Medicine> medicineList = new ArrayList<>();
        List<Procedure> procedureList = new ArrayList<>();
        List<DiagnosticAssistance> diagnosticAssistanceList = new ArrayList<>();

        if (request.getMedicationList() != null && !request.getMedicationList().isEmpty()) {
            for (var medicineRequest: request.getMedicationList()) {
                Medicine medicine = new Medicine();
                medicine.setOrderNumber(recordValidator.orderNumberValidator(medicineRequest.getOrderNumber()));
                //medicine.setMedicineId(recordValidator.medicineValidator(medicineRequest.getMedicineId()));
                medicine.setDose(recordValidator.doseValidator(medicineRequest.getDose()));
                medicine.setTreatmentDuration(recordValidator.treatmentValidator(medicineRequest.getTreatmentDuration()));
                medicine.setItemId(recordValidator.itemIdValidator(medicineRequest.getItemId()));

                medicineList.add(medicine);
            };
        }

        if (request.getProcedureList() != null && !request.getProcedureList().isEmpty()) {
            for (var procedureRequest: request.getProcedureList()) {
                Procedure procedure = new Procedure();
                procedure.setOrderNumber(recordValidator.orderNumberValidator(procedureRequest.getOrderNumber()));
                //procedure.setProcedureId(recordValidator.procedureValidator(procedureRequest.getProcedureId()));
                procedure.setRepetitionNumber(recordValidator.repetitionNumberValidator(procedureRequest.getRepetitionNumber()));
                procedure.setRepetitionFrequency(recordValidator.repetitionFrequencyValidator(procedureRequest.getRepetitionFrequency()));
                procedure.setRequiresSpecialistAssistance(procedureRequest.isRequiresSpecialistAssistance());
                procedure.setSpecialistId(recordValidator.documentValidator(procedureRequest.getSpecialistId()));
                procedure.setItemId(recordValidator.itemIdValidator(procedureRequest.getItemId()));

                procedureList.add(procedure);
            }
        }

        if (request.getDiagnosticAssistanceList() != null && !request.getDiagnosticAssistanceList().isEmpty()) {
            for (var diagnosticAssistanceRequest: request.getDiagnosticAssistanceList()) {
                DiagnosticAssistance diagnosticAssistance = new DiagnosticAssistance();
                diagnosticAssistance.setOrderNumber(recordValidator.orderNumberValidator(diagnosticAssistanceRequest.getOrderNumber()));
                //diagnosticAssistance.setDiagnosticAssistanceId(recordValidator.diagnosisAssistanceValidator(diagnosticAssistanceRequest.getDiagnosticAssistanceId()));
                diagnosticAssistance.setQuantity(recordValidator.quantityValidator(diagnosticAssistanceRequest.getQuantity()));
                diagnosticAssistance.setRequiresSpecialistAssistance(diagnosticAssistanceRequest.isRequiresSpecialistAssistance());
                diagnosticAssistance.setSpecialistId(recordValidator.documentValidator(diagnosticAssistanceRequest.getSpecialistId()));
                diagnosticAssistance.setItemId(recordValidator.itemIdValidator(diagnosticAssistanceRequest.getItemId()));

                diagnosticAssistanceList.add(diagnosticAssistance);
            }
        }


        ClinicalRecord clinicalRecord = new ClinicalRecord();
        clinicalRecord.setEmployeeId(recordValidator.documentValidator(request.getEmployeeId()));
        clinicalRecord.setReason(recordValidator.reasonValidator(request.getReason()));
        clinicalRecord.setSymptomatology(recordValidator.symptomatologyValidator(request.getSymptomatology()));
        clinicalRecord.setDiagnosis(recordValidator.diagnosisValidator(request.getDiagnosis()));
        clinicalRecord.setMedicationList(medicineList);
        clinicalRecord.setProcedureList(procedureList);
        clinicalRecord.setDiagnosticAssistanceList(diagnosticAssistanceList);

        return clinicalRecord;
    }

    public long getId(String id) throws Exception {

        return recordValidator.documentValidator(id);
    }
}
