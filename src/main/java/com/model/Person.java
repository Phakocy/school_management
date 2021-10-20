package com.model;

  public  abstract class Person {

        private String collegeName;
        private String firstName;
        private String lastName;
        private String gender;

      public Person(String collegeName, String firstName, String lastName, String gender) {
          this.collegeName = collegeName;
          this.firstName = firstName;
          this.lastName = lastName;
          this.gender = gender;
      }

      public String getCollegeName() {
          return collegeName;
      }

      public void setCollegeName(String collegeName) {
          this.collegeName = collegeName;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

        //abstract void privilege();

      public String getFullName() {

          String fullName = this.firstName + " " + this.lastName;

          return fullName;
      }

      @Override
      public String toString() {
          return getFullName();

      }
  }
