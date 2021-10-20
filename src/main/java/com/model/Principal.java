package com.model;

import java.util.*;


public class Principal extends Person implements IExtraDetails {

    public final List<Applicant> applicants = new ArrayList<>();
    public final List<Student> students = new ArrayList<>();
//    public final List<Student> javaStudents = new ArrayList<>();
//    public final List<Student> iosstudents = new ArrayList<>();



    public Principal(String collegeName, String firstName, String lastName, String gender) {
        super(collegeName, firstName, lastName, gender);
    }

    public boolean admitApplicant (Applicant applicant) {

        int APPLICANT_GRADE_LIMIT = 50;
        int APPLICANT_AGE_LIMIT = 18;

        if ((applicant.getAge() >= APPLICANT_AGE_LIMIT) && (applicant.getGrade() >= APPLICANT_GRADE_LIMIT)) {

            applicants.add(applicant);

            System.out.println("Applicant Admitted");

        } else {

            System.out.println("Applicant " + applicant.getFullName() + " with age "+ applicant.getAge() + " and score " + applicant.getGrade() + " was not admitted");
        }

        System.out.println("New number of applicant equals: " +  applicants.size());

        return true;
    }

    public boolean expelStudent( Student student) {

        if(student.isFvckUp()){

            students.remove(student);

            System.out.println("The student " + student.getFullName() + " with student Id " + student.getId() + " has been expelled.");

        } else {

            System.out.println("The student " + student.getFullName() + " with student Id " + student.getId() + " was not expelled.");
        }

        return true;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String role() {
        String role =  "Principal";

        return role;
    }

    @Override
    public void qualification() {
        System.out.println("Msc");
    }

    @Override
    public void department() {
        System.out.println("Admin");
    }

//    public boolean placeStudentInClassroom (Student student){
//
//        if (student.getStack().equalsIgnoreCase("java")) {
//
//            javaStudents.add(student);
//
//            System.out.println("==============java students are : {}" + javaStudents.size());
//
//            students.add((javaStudents);
//
//            System.out.println("============== students are : {}" + students.size());
//
//            return true;
//        }
//        return false;
//    }


}
