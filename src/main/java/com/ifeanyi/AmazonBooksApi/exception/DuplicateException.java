package com.ifeanyi.AmazonBooksApi.exception;

public class DuplicateException extends Exception{

    private static final long serialVersionID = 1L;

    public DuplicateException(String message) {
        super(message);
    }
}
