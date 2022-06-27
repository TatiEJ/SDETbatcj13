package com.syntax.review;

public class Hospital {
    public static void main(String[] args) {

        Doctor doc = new Doctor("Jane", "Smith");
        System.out.println(doc.firstName);
        System.out.println(doc.lastName);
        Doctor.hospital = "Washington";
        doc.work();

        System.out.println("--------------------------");
        Doctor doctor = new Doctor("joe", "Doe", "cardiologyst", 10);
        doctor.printInfo();
        doctor.work();

        System.out.println("--------------------------");
        Doctor.hospital = "George Washington";
        doc.work();
        doctor.work();

        System.out.println(" changing value of instance variable");
        doc.lastName = "Obama";
        doc.printInfo();
        doctor.printInfo();
        doc.hospital = "Mayo Clinic";

        System.out.println("                                       ");
        doc.work();
        doctor.work();

        doctor.treat("Samantha");

        //accessing static method
        Doctor.study("GTU");

    }}
