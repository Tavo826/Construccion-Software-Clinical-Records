package com.construccion.software.records.adapter.in.validators;

import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class RecordValidator extends SimpleValidator {

    public long documentValidator(String value) throws Exception {
        return longValidator("documento", value);
    }

    public LocalDate dateValidator(String value) throws Exception {
        return dateValidator("fecha de atención", value);
    }

    public String reasonValidator(String value) throws Exception {
        return stringValidator("motivo de consulta", value);
    }

    public String symptomatologyValidator(String value) throws Exception {
        return stringValidator("síntomas", value);
    }

    public String diagnosisValidator(String value) throws Exception {
        return stringValidator("diagnóstico", value);
    }

    public String orderNumberValidator(String value) throws Exception {
        return stringValidator("número de la order", value);
    }

    public String medicineValidator(String value) throws Exception {
        return stringValidator("id del medicamento", value);
    }

    public String doseValidator(String value) throws Exception {
        return stringValidator("dosis", value);
    }

    public String treatmentValidator(String value) throws Exception {
        return stringValidator("duración tratamiento", value);
    }

    public long itemIdValidator(String value) throws Exception {
        return longValidator("id del item", value);
    }

    public String procedureValidator(String value) throws Exception {
        return stringValidator("id del procedimiento", value);
    }

    public long quantityValidator(String value) throws Exception {
        return longValidator("id del item", value);
    }

    public String repetitionNumberValidator(String value) throws Exception {
        return stringValidator("veces que se repite", value);
    }

    public String repetitionFrequencyValidator(String value) throws Exception {
        return stringValidator("frecuencia", value);
    }

    public String diagnosisAssistanceValidator(String value) throws Exception {
        return stringValidator("ayuda diagnóstica", value);
    }
}
