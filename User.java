package com.adp3.submissions;

public class User {

    String name, surname;
    long studentNumber;

    public User(String name, String surname, long studNo){
        this.name = name;
        this.surname = surname;
        this.studentNumber = studNo;
    }

    public User(){
        this.name = "";
        this.surname = "";
        this.studentNumber = 0;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setStudentNumber(long studentNumber) {
        this.studentNumber = studentNumber;
    }

    public long getStudentNumber() {
        return studentNumber;
    }

    @Override
    public String toString() {
        String message = String.format("%s %s %d", getName(), getSurname(), getStudentNumber());
        return message;
    }


}       //end class
