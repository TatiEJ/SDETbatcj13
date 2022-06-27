package com.syntax.class19;

public class SDET extends Human {
    boolean goodWithJava;
    SDET(String name, String eyeColor, String job, int age, boolean goodWithJava){
        //this.name is coming from parent class human
        this.name=name;
        this.eyeColor=eyeColor;
        this.job=job;
        this.age=age;

    }

    void printInfo(){
        System.out.println("my name is "+name+" I do "+job+" am I good with Java "+goodWithJava);
    }
    public static void main(String[] args){
        SDET sdet=new SDET("sammer","black","gym",22, true);
    sdet.printInfo();

    }

}
