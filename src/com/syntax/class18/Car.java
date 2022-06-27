package com.syntax.class18;

public class Car {
        String make;
        String model;
        String color;
        public Car(String carMake, String carModel, String carColor){
            make=carMake;
            model=carModel;
            color=carColor;
        }

    public Car(String carModel){
        model=carModel;
    }

    /* public Car(String sdfs){
         model=carModel;
         //it is not allowed to have two constructors in a class with same number of parameters and same type
     }*/
    void printCarModel(){
        System.out.println("Model "+model);
    }

    void printInfo(){
            System.out.println("CarMake "+make+ " Model "+model+ " Color "+color);
        }// for testing this class, we are going to create carTester class
    }