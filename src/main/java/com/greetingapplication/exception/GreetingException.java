/****************************************************************************
 * @purpose : Greeting exception used for handling the custom exception
 * @author  : Seema Rajpure
 * @Date    : 03/07/2020
 ****************************************************************************/
package com.greetingapplication.exception;

public class GreetingException extends RuntimeException {

    public String message;

    public GreetingException(String message) {
        this.message = message;
    }
}