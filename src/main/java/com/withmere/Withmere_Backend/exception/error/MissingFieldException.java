package com.withmere.Withmere_Backend.exception.error;

public class MissingFieldException extends RuntimeException {
    public MissingFieldException(String message) {
        super(message);
    }
}