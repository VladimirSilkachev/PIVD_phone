package com.company;

public class RecordNotValid extends Exception{

    public RecordNotValid(String message) {

        super(message);
    }

    public String getMessage(String message){
        return message;
    }
}
