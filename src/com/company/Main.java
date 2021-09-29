package com.company;

public class Main {

    public static void main(String[] args) throws RecordNotFound, RecordNotValid, PhoneNumberAlreadyExists {
	Record phone1 = new Record(1, "89619997418", "DEATH");
    Record phone2 = new Record(2, "89609547080", "PESTILENCE");
    Record phone3 = new Record(3, "89619597418", "WAR");
    Record phone4 = new Record(4, "89139065473", "FAMINE");

    PhoneBook book = new PhoneBook();
    try {
        book.createRecord(phone1);
        book.createRecord(phone2);
        book.createRecord(phone3);
        book.createRecord(phone4);

    }catch(PhoneNumberAlreadyExists e){
        System.out.println(e.getMessage());
        throw e;
    }
    System.out.println(book.getAllRecords());
    Record phone = new Record(2, "89619997418", "oleg");
    try {
        book.updateRecord(phone);
    }catch(RecordNotValid e){
        System.out.println(e.getMessage());
        throw e;
        }

    System.out.println(book.getAllRecords());

    book.deleteRecord(3);
     System.out.println(book.getAllRecords());
    }
}
