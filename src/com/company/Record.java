package com.company;

public class Record {
    private long id;
    private String phoneNumber;
    private String name;

    public Record(long id, String phoneNumber, String name){
        setId(id);
        setPhoneNumber(phoneNumber);
        setName(name);
    }

    public void setId(long id){
        this.id = id;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setName(String name){
        this.name = name;
    }

    public long getId(){
        return this.id;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return id + " " + phoneNumber + " " + name;
    }


}
