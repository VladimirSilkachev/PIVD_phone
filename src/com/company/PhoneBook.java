package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {

    private ArrayList<Record> list = new ArrayList<>();

    public PhoneBook(){

    }

    public ArrayList<Record> getAllRecords(){
        return this.list;
    }

    public void createRecord(Record record) throws PhoneNumberAlreadyExists{
        for(Record i: list){
            if(record.getPhoneNumber().equals(i.getPhoneNumber())) throw new PhoneNumberAlreadyExists("Этот номер телефона уже существует");
        }
        this.list.add(record);
    }

    public void updateRecord(Record record) throws RecordNotFound, RecordNotValid {
        if(record.getPhoneNumber().equals("")||record.getName().equals("")||record.getId() == 0L) throw
                new RecordNotValid("Не заполнены имя и/или номер телефона");
        int count = -1;
        for(Record i: list) {
            count++;
            if(i.getId() == record.getId()) {
                i.setPhoneNumber(record.getPhoneNumber());
                i.setName(record.getName());
            }
        if(count == list.size()) throw new RecordNotFound("Не существующий номер");
        }
    }

    public void deleteRecord(long id) throws RecordNotFound {
        int count = -1;
        for(Record i: list) {
            if (i.getId() == id) {;
                list.remove(i);
            }
            count++;
        }
        if (count == list.size()) throw new RecordNotFound("Не существующий номер");
    }
}
