package com.netcracker.pom.model;

public class Group {
    private int number;
    private String[] faculty;

    public Group(int number, String[] faculty) {
        this.number = number;
        this.faculty = faculty;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String[] getFaculty() {
        return faculty;
    }

    public void setFaculty(String[] faculty) {
        this.faculty = faculty;
    }
}
