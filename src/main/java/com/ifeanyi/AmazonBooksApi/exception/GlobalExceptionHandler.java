package com.ifeanyi.AmazonBooksApi.exception;

import com.ifeanyi.AmazonBooksApi.exception.model.ExcResponse;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.reactive.result.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<ExcResponse> handleGlobalException(Exception exception){
//
//        ExcResponse excResponse = new ExcResponse(exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value(),new Date());
//
//        return new ResponseEntity<>(excResponse,HttpStatus.INTERNAL_SERVER_ERROR);
//
//    }
    @ExceptionHandler(DuplicateKeyException.class)
    public ResponseEntity<ExcResponse> handleGlobalException(DuplicateKeyException exception){

        ExcResponse excResponse = new ExcResponse("Email already in use. Use {/api_users/email} to get api key", HttpStatus.BAD_REQUEST.value(),new Date());

        return new ResponseEntity<>(excResponse,HttpStatus.BAD_REQUEST);

    }
//    @ExceptionHandler(DuplicateKeyException.class)
//    public ResponseEntity<ExcResponse> handleMonoException(DuplicateKeyException exception){
//
//        ExcResponse excResponse = new ExcResponse("Email already in use. Use {/api_users/email} to get api key", HttpStatus.BAD_REQUEST.value(),new Date());
//
//        return new ResponseEntity<>(excResponse,HttpStatus.BAD_REQUEST);
//
//    }

    @ExceptionHandler(DuplicateException.class)
    public ResponseEntity<ExcResponse> handleDuplicateException(DuplicateException exception){

        ExcResponse excResponse = new ExcResponse(exception.getMessage(), HttpStatus.BAD_REQUEST.value(),new Date());

        return new ResponseEntity<>(excResponse,HttpStatus.BAD_REQUEST);

    }

}
