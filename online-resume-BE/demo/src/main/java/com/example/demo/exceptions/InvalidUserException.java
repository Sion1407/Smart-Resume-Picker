package com.example.demo.exceptions;

public class InvalidUserException extends RuntimeException {
    public InvalidUserException() {
        super();
    }

    public InvalidUserException(String code, String message) {
        super(message);
    }
    public InvalidUserException(String message) {
        super(message);
    }

    public InvalidUserException( String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidUserException(Throwable cause) {
        super(cause);
    }
}

