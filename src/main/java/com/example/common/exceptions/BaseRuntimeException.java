package com.example.common.exceptions;

import lombok.Getter;

@Getter
public abstract class BaseRuntimeException extends RuntimeException{
    private final ErrorCode errorCode;
    private final String message;

    public BaseRuntimeException(
            ErrorCode errorCode,
            String message
    ) {
        super(message);
        this.errorCode = errorCode;
        this.message = message;
    }
}