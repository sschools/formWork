package com.example.formwork.model;

public class Person {
    private String firstName;
    private String lastName;
    private String title;
    private int numKids;
    public String[] titleList = new String[3];

    public void setTitleList() {
        this.titleList[0] = "President";
        this.titleList[1] = "Colonel";
        this.titleList[2] = "Doctor";
    }

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumKids() {
        return numKids;
    }

    public void setNumKids(int numKids) {
        this.numKids = numKids;
    }
}
