package com.construccion.software.records.adapter.in.validators;

import com.construccion.software.records.application.exceptions.InputsException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class SimpleValidator {

    public String stringValidator(String element, String value) throws Exception {
        if (value == null || value.equals("")) {
            throw new InputsException(element + " no puede tener un valor vacío o nulo");
        }
        return value;
    }

    public long longValidator(String element, String value) throws Exception {
        stringValidator(element, value);
        try {
            return Long.parseLong(value);
        } catch (Exception e) {
            throw new InputsException(element + " debe ser un valor numérico");
        }
    }

    public LocalDate dateValidator(String element, String value) throws Exception {
        stringValidator(element, value);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            LocalDate date = LocalDate.parse(value, formatter);

            if (date.isAfter(LocalDate.now().plusYears(150))) {
                throw new InputsException(element + " máximo 150 años");
            }

            return date;
        } catch (Exception e) {
            throw new InputsException(element + " debe ser una fecha válida en formato dd/MM/yyyy");
        }
    }
}
