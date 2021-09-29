package com.company;

public class PhoneNumberAlreadyExists extends Exception{

    public PhoneNumberAlreadyExists(String message){
        super(message);
    }

    public String getMessage(String message){
        return message;
    }
}
