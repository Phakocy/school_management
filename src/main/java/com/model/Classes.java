package com.model;

import java.util.ArrayList;
import java.util.List;

public class Classes {

    private String name;
    private List<Student> students = new ArrayList<Student>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

}










//
///    public boolean placeStudentInClassroom (Student student){
////
////        if (student.getStack().equalsIgnoreCase("java")) {
////
////            javaStudents.add(student);
////
////            System.out.println("==============java students are : {}" + javaStudents.size());
////
////            students.add((javaStudents);
////
////            System.out.println("============== students are : {}" + students.size());
////
////            return true;
////        }
////        return false;
////    }
//
//
//        }
