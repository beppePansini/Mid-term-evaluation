package com.digitazon.totalizable;

public class CustomAllStringException extends Exception {

    public CustomAllStringException(String message, Throwable cause) {
        super("non posso convertire queste stringhe", cause);
    }
}
