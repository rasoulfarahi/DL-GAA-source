package org.dlgaa.config;

public enum Mode {
    STATIC,
    DYNAMIC;

    public static Mode fromString(String value) {
        if (value == null || value.isBlank()) {
            return DYNAMIC;
        }
        return Mode.valueOf(value.trim().toUpperCase());
    }
}
