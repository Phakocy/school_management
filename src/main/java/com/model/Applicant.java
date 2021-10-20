package com.model;

public class Applicant extends Person {

    int age;
    int grade;

    public Applicant(String collegeName, String firstName, String lastName, String gender, int age, int grade) {
        super(collegeName, firstName, lastName, gender);
        this.age = age;
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

}
