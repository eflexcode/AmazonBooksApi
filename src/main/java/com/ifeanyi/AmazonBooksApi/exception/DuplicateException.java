package com.ifeanyi.AmazonBooksApi.exception;

import java.io.Serial;

public class DuplicateException extends Exception{


    private static final long serialVersionUID  = 1L;

    public DuplicateException(String message) {
        super(message);
    }
}
