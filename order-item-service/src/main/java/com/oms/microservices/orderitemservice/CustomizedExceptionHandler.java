package com.oms.microservices.orderitemservice;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
@RestController
public class CustomizedExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(OrderNotFoundException.class)
	public final ResponseEntity<Object> handleException(Exception e){
		ExceptionResponse res = new ExceptionResponse(new Date(), e.getMessage());
		return new ResponseEntity(res, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
