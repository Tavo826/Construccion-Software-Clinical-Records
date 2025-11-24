package com.construccion.software.records.infrastructure.persistence.mapper;

import com.construccion.software.records.domain.models.*;
import com.construccion.software.records.domain.models.Record;
import com.construccion.software.records.infrastructure.persistence.entities.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecordMapper {

    public static RecordEntity toEntity(Record record) {

        if (record == null) return null;

        RecordEntity entity = new RecordEntity();
        entity.setDocumentId(record.getDocumentId());
        entity.setClinicalRecords(toEntity(record.getClinicalRecords()));

        return entity;
    }

    public static Map<String, ClinicalRecordEntity> toEntity(Map<String, ClinicalRecord> clinicalRecordMap) {

        if (clinicalRecordMap == null) return null;

        Map<String, ClinicalRecordEntity> clinicalRecordEntityMap = new HashMap<String, ClinicalRecordEntity>();
        clinicalRecordMap.forEach((key, value) -> {
            clinicalRecordEntityMap.put(key, toEntity(value));
        });

        return clinicalRecordEntityMap;
    }

    public static ClinicalRecordEntity toEntity(ClinicalRecord clinicalRecord) {

        if (clinicalRecord == null) return null;

        ClinicalRecordEntity entity = new ClinicalRecordEntity();
        entity.setEmployeeId(clinicalRecord.getEmployeeId());
        entity.setReason(clinicalRecord.getReason());
        entity.setSymptomatology(clinicalRecord.getSymptomatology());
        entity.setDiagnosis(clinicalRecord.getDiagnosis());
        entity.setMedicationList(toMedicineEntity(clinicalRecord.getMedicationList()));
        entity.setProcedureList(toProcedureEntity(clinicalRecord.getProcedureList()));
        entity.setDiagnosticAssistanceList(toDiagnosticAssistanceEntity(clinicalRecord.getDiagnosticAssistanceList()));

        return entity;
    }

    public static List<MedicineEntity> toMedicineEntity(List<Medicine> medicineList) {

        if (medicineList == null) return null;

        List<MedicineEntity> entityList = new ArrayList<MedicineEntity>();
        medicineList.forEach(medicine -> {
            entityList.add(toEntity(medicine));
        });

        return entityList;
    }

    public static MedicineEntity toEntity(Medicine medicine) {

        if (medicine == null) return null;

        MedicineEntity entity = new MedicineEntity();
        entity.setOrderNumber(medicine.getOrderNumber());
        entity.setMedicineId(medicine.getMedicineId());
        entity.setDose(medicine.getDose());
        entity.setTreatmentDuration(medicine.getTreatmentDuration());

        return entity;
    }

    public static List<ProcedureEntity> toProcedureEntity(List<Procedure> procedureList) {

        if (procedureList == null) return null;

        List<ProcedureEntity> entityList = new ArrayList<>();
        procedureList.forEach(procedure -> {
            entityList.add(toEntity(procedure));
        });

        return entityList;
    }

    public static ProcedureEntity toEntity(Procedure procedure) {

        if (procedure == null) return null;

        ProcedureEntity entity = new ProcedureEntity();
        entity.setOrderNumber(procedure.getOrderNumber());
        entity.setProcedureId(procedure.getProcedureId());
        entity.setRepetitionNumber(procedure.getRepetitionNumber());
        entity.setRepetitionFrequency(procedure.getRepetitionFrequency());
        entity.setRequiresSpecialistAssistance(procedure.isRequiresSpecialistAssistance());
        entity.setSpecialistId(procedure.getSpecialistId());
        entity.setItemId(procedure.getItemId());

        return entity;
    }

    public static List<DiagnosticAssistanceEntity> toDiagnosticAssistanceEntity(List<DiagnosticAssistance> diagnosticAssistanceList) {

        if (diagnosticAssistanceList == null) return null;

        List<DiagnosticAssistanceEntity> entityList = new ArrayList<>();
        diagnosticAssistanceList.forEach(diagnosticAssistance -> {
            entityList.add(toEntity(diagnosticAssistance));
        });

        return entityList;
    }

    public static DiagnosticAssistanceEntity toEntity(DiagnosticAssistance diagnosticAssistance) {

        if (diagnosticAssistance == null) return null;

        DiagnosticAssistanceEntity entity = new DiagnosticAssistanceEntity();
        entity.setOrderNumber(diagnosticAssistance.getOrderNumber());
        entity.setDiagnosticAssistanceId(diagnosticAssistance.getDiagnosticAssistanceId());
        entity.setQuantity(diagnosticAssistance.getQuantity());
        entity.setItemId(diagnosticAssistance.getItemId());
        entity.setRequiresSpecialistAssistance(diagnosticAssistance.isRequiresSpecialistAssistance());
        entity.setSpecialistId(diagnosticAssistance.getSpecialistId());

        return entity;
    }

    public static Record toDomain(RecordEntity entity) {

        if (entity == null) return null;

        Record record = new Record();
        record.setDocumentId(entity.getDocumentId());
        record.setClinicalRecords(toDomain(entity.getClinicalRecords()));

        return record;
    }

    public static Map<String, ClinicalRecord> toDomain(Map<String, ClinicalRecordEntity> clinicalRecordEntityMap) {

        if (clinicalRecordEntityMap == null) return null;

        Map<String, ClinicalRecord> clinicalRecordMap = new HashMap<String, ClinicalRecord>();
        clinicalRecordEntityMap.forEach((key, value) -> {
            clinicalRecordMap.put(key, toDomain(value));
        });

        return clinicalRecordMap;
    }

    public static ClinicalRecord toDomain(ClinicalRecordEntity entity) {

        if (entity == null) return null;

        ClinicalRecord clinicalRecord = new ClinicalRecord();
        clinicalRecord.setEmployeeId(entity.getEmployeeId());
        clinicalRecord.setReason(entity.getReason());
        clinicalRecord.setSymptomatology(entity.getSymptomatology());
        clinicalRecord.setDiagnosis(entity.getDiagnosis());
        clinicalRecord.setMedicationList(toMedicineDomain(entity.getMedicationList()));
        clinicalRecord.setProcedureList(toProcedureDomain(entity.getProcedureList()));
        clinicalRecord.setDiagnosticAssistanceList(toDiagnosticAssistanceDomain(entity.getDiagnosticAssistanceList()));

        return clinicalRecord;
    }

    public static List<Medicine> toMedicineDomain(List<MedicineEntity> medicineEntityList) {

        if (medicineEntityList == null) return null;

        List<Medicine> medicineList = new ArrayList<Medicine>();
        medicineEntityList.forEach(medicine -> {
            medicineList.add(toDomain(medicine));
        });

        return medicineList;
    }

    public static Medicine toDomain(MedicineEntity entity) {

        if (entity == null) return null;

        Medicine medicine = new Medicine();
        medicine.setOrderNumber(entity.getOrderNumber());
        medicine.setMedicineId(entity.getMedicineId());
        medicine.setDose(entity.getDose());
        medicine.setTreatmentDuration(entity.getTreatmentDuration());

        return medicine;
    }

    public static List<Procedure> toProcedureDomain(List<ProcedureEntity> procedureEntityList) {

        if (procedureEntityList == null) return null;

        List<Procedure> procedureList = new ArrayList<>();
        procedureEntityList.forEach(procedure -> {
            procedureList.add(toDomain(procedure));
        });

        return procedureList;
    }

    public static Procedure toDomain(ProcedureEntity entity) {

        if (entity == null) return null;

        Procedure procedure = new Procedure();
        procedure.setOrderNumber(entity.getOrderNumber());
        procedure.setProcedureId(entity.getProcedureId());
        procedure.setRepetitionNumber(entity.getRepetitionNumber());
        procedure.setRepetitionFrequency(entity.getRepetitionFrequency());
        procedure.setRequiresSpecialistAssistance(entity.isRequiresSpecialistAssistance());
        procedure.setSpecialistId(entity.getSpecialistId());
        procedure.setItemId(entity.getItemId());

        return procedure;
    }

    public static List<DiagnosticAssistance> toDiagnosticAssistanceDomain(List<DiagnosticAssistanceEntity> diagnosticAssistanceEntityList) {

        if (diagnosticAssistanceEntityList == null) return null;

        List<DiagnosticAssistance> diagnosticAssistanceList = new ArrayList<>();
        diagnosticAssistanceEntityList.forEach(diagnosticAssistance -> {
            diagnosticAssistanceList.add(toDomain(diagnosticAssistance));
        });

        return diagnosticAssistanceList;
    }

    public static DiagnosticAssistance toDomain(DiagnosticAssistanceEntity entity) {

        if (entity == null) return null;

        DiagnosticAssistance diagnosisAssistance = new DiagnosticAssistance();
        diagnosisAssistance.setOrderNumber(entity.getOrderNumber());
        diagnosisAssistance.setDiagnosticAssistanceId(entity.getDiagnosticAssistanceId());
        diagnosisAssistance.setQuantity(entity.getQuantity());
        diagnosisAssistance.setItemId(entity.getItemId());
        diagnosisAssistance.setRequiresSpecialistAssistance(entity.isRequiresSpecialistAssistance());
        diagnosisAssistance.setSpecialistId(entity.getSpecialistId());

        return diagnosisAssistance;
    }
}
