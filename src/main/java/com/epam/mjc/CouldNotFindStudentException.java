package com.epam.mjc;

public class CouldNotFindStudentException extends IllegalArgumentException{

    public CouldNotFindStudentException(String s) {
        super(s);
    }
    public CouldNotFindStudentException(String message, Throwable cause) {
        super(message, cause);
    }
}
