package com.model;


public class Course {
    String title;
    String code;

    public Course(String title, String code) {
        this.title = title;
        this.code = code;
    }

    @Override
    public String toString() {
        return title;
    }

}

