package com.example.demo.exceptions;

public class NoUserNameFoundException extends RuntimeException{
    public NoUserNameFoundException() {
        super();
    }

    public NoUserNameFoundException(String code, String message) {
        super(message);
    }
    public NoUserNameFoundException(String message) {
        super(message);
    }

    public NoUserNameFoundException( String message, Throwable cause) {
        super(message, cause);
    }

    public NoUserNameFoundException(Throwable cause) {
        super(cause);
    }
}
