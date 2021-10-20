package com.model;

public class Student extends Person {

    private Course course;
    private final int id;
    private boolean fvckUp;
    private String stack;

    public Student(String collegeName, String firstName, String lastName, String gender, int id, String stack) {
        super(collegeName, firstName, lastName, gender);
        this.id = id;
        this.fvckUp = false;
        this.stack = stack;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public boolean isFvckUp() {
        return fvckUp;
    }

    public void setFvckUp(boolean fvckUp) {
        this.fvckUp = fvckUp;
    }

}
