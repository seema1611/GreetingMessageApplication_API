/*********************************************************************
 * @purpose : Greeting Exception used for handling the exception
 * @author  : Seema Rajpure
 * @Date    : 03/07/2020
 *********************************************************************/

package com.greetingapplication.exception;

public class GreetingException extends RuntimeException {

    public ExceptionType type;

    public enum ExceptionType {
        USER_NOT_FOUND;
    }

    public GreetingException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}


