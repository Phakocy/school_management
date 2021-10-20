package com.model;

public class Main {

    public static void main(String[] args) {

        Principal principal = new Principal("Lasmock", "Buhari", "Bubu", "Male");

        Course maths = new Course("Mathematics", "MAT101");
        Course english = new Course("English Language", "ENG101");
        Course general = new Course("General Studies", "GNS01");

        Student student001 = new Student("LASMOCK", "Christiano", "Ronaldo", "Male", 001, "java");
        Student student002 = new Student("LASMOCK", "Lionel", "Messi", "Male", 002, "java");
        Student student003 = new Student("LASMOCK", "Azeezat", "Oshoala", "Female", 002, "Ios");

        student001.setCourse(maths);
        student001.setFvckUp(true);
        System.out.println("====================");
        System.out.println(student001.isFvckUp());
        System.out.println("====================\n" );



        System.out.println("This is for student: " + principal.students.size());
//        System.out.println("This is for javastudent: " + principal.javaStudents.size());
//        System.out.println("This is for boolean: " + principal.placeStudentInClassroom(student001));

        student002.setCourse(english);
//
//        principal.placeStudentInClassroom(student001);
//        principal.placeStudentInClassroom(student002);

//        principal.getStudents().add(student001);
//        principal.getStudents().add(student002);
//        principal.getStudents().add(student003);

        System.out.println(student001.getLastName() + " " + "is a " + student001.getGender() + " student who offer "
                + maths.title + " in " + student001.getCollegeName());

        principal.expelStudent(student001);

        Classes class1 = new Classes();

        class1.setName("Java Class");
        class1.setStudents(principal.getStudents());


//        String collegeName, String firstName, String lastName, String gender

        Applicant applicant001 = new Applicant(null, "yahaya", "Ebuka", "male", 20, 50);
        Applicant applicant002 = new Applicant(null, "Dennis", "Cook", "male", 29, 90);
        Applicant applicant003 = new Applicant(null, "Feyi", "Chidi", "female", 20, 45);

        principal.admitApplicant(applicant001);
        principal.admitApplicant(applicant002);
        principal.admitApplicant(applicant003);



        Teacher teacher001 = new Teacher("Lasmock", "Abacha", "Sani", "Male", "Senior Teacher");
        Teacher teacher002 = new Teacher("Lasmock", "Yaradua", "Musa Umar", "male", "Junior teacher");

        teacher001.setCourse(maths);
        teacher002.setCourse(english);

      System.out.println(teacher002.getFullName() + " is a " + teacher002.getGender() + " " +  teacher001.role()
                           + " in " + teacher002.getCollegeName() + " who teaches " + teacher002.getCourse());
        }

    }






