/****************************************************************************
 * @purpose : Greeting exception used for handling the exception
 * @author  : Seema Rajpure
 * @Date    : 03/07/2020
 ****************************************************************************/

package com.greetingapplication.exception;

public class GreetingException extends RuntimeException {

    public enum ExceptionType {
        USER_NOT_FOUND;
    }

    public GreetingException(String message) {
        super(message);
    }
}