package com.construccion.software.records.adapter.in.validators;

import com.construccion.software.records.application.exceptions.InputsException;

public abstract class SimpleValidator {

    public String stringValidator(String element, String value) throws Exception {
        if (value == null || value.equals("")) {
            throw new InputsException(element + " no puede tener un valor vacío o nulo");
        }
        return value;
    }
}
