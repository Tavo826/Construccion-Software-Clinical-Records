package com.construccion.software.records.adapter.in.validators;

import org.springframework.stereotype.Component;

@Component
public class RecordValidator extends SimpleValidator {

    public String idValidator(String value) throws Exception {
        return stringValidator("id del historial", value);
    }

    public String nameValidator(String value) throws Exception {
        return stringValidator("nombre", value);
    }
}
