package com.model;

public class Teacher extends Person implements IExtraDetails {

    private Course course;
    private String roleTitle;

    public Teacher(String collegeName, String firstName, String lastName, String gender, String roleTitle) {
        super(collegeName, firstName, lastName, gender);

        this.roleTitle = roleTitle;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    void work(){
        System.out.println("teaches a course");
    }

   @Override
   public String role() {

      String role =  "Teacher";
      return role;
   }

  @Override
   public void qualification( ){
        System.out.println("NCE");
   }

    @Override
    public void department() {
        System.out.println("Science");
    }

    public String getRoleTitle() {
        return roleTitle;
    }

    public void setRoleTitle(String roleTitle) {
        this.roleTitle = roleTitle;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "course=" + course +
                ", roleTitle='" + roleTitle + '\'' +
                '}';
    }
}
