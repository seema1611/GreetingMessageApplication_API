/****************************************************************************
 * @purpose : Handler exception used for handling the global exception
 * @author  : Seema Rajpure
 * @Date    : 03/07/2020
 ****************************************************************************/

package com.greetingapplication.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HandlerException {

    @ExceptionHandler
    public ResponseEntity<String> handlingException(GreetingException greetingException) {
        return new ResponseEntity<>(greetingException.message, HttpStatus.OK);
    }
}
