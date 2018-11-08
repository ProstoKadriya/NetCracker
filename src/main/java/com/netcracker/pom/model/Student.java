package com.netcracker.pom.model;

public class Student {
    public class Group{
        private int number;
        private String[] faculty;

        public Group(int number,String[] faculty) {
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
    private String[] name;
    private Group group;
    private String[] data;

    public Student(String[] name, Group group, String[] data) {
        this.name = name;
        this.group = group;
        this.data = data;
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String[] getData() {
        return data;
    }

    public void setData(String[] data) {
        this.data = data;
    }
}
