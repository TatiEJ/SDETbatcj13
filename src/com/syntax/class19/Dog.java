package com.syntax.class19;

class Animal{
    String name;
    String breed;
    String color;
    int age;
    double weight;
}
public class Dog extends Animal {
   Dog(String name,String color){
       this.name=name;
       this.color=color;
   }
   void printInfo(){
       System.out.println("name "+name+" color "+color);
   }
}
class Cat extends Animal {
    Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }
    void printInfo(){
        System.out.println("name "+name+" color "+color);
    }
}