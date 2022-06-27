package com.syntax.review;

public class Doctor {
    public String firstName, lastName,
     Speciality;

    int experience;
    double salary;

    static String hospital;
    Doctor(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;

    }

    Doctor(String firstName, String lastName, String Speciality, int experience){
        this(firstName, lastName);
        this.Speciality=Speciality;
        this.experience=experience;
    }
    void printInfo() {
        System.out.println("Doctor name is " + firstName + " " + lastName
                + " and speciality is " + Speciality);

    }

    void work() {
        System.out.println("Doctor "+lastName+" works at "+hospital);
    }

    void treat(String patientName){
      this.printInfo();
        System.out.println(" Treat patient "+patientName);
    }
    //static
    static void study(String university) {
       // printInfo(); CE: Cannot make a static reference to the
        System.out.println("Doctor studied at "+university+" and now works at "+hospital);

    }
}
