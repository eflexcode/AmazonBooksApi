package com.ifeanyi.AmazonBooksApi.exception;

import com.ifeanyi.AmazonBooksApi.exception.model.ExcResponse;
import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.reactive.error.DefaultErrorAttributes;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.result.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandlerFlux extends DefaultErrorAttributes {
    @Override
    public Map<String, Object> getErrorAttributes(ServerRequest request, ErrorAttributeOptions options) {

        Map<String,Object> map = super.getErrorAttributes(request, options);
        map.put("message","Invalid APIKEY");
        map.put("status",HttpStatus.BAD_REQUEST.value());
        map.put("timestamp",new Date());

        return map;
    }
}
