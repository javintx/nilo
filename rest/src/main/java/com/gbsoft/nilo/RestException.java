package com.gbsoft.nilo;

public class RestException extends Exception {
    public RestException(final String message) {
        super(message);
    }

    public RestException(Throwable cause) {
        super(cause);
    }
}
