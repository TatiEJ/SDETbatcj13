package com.syntax.class15;

public class variablesDemo1 {

    String name; //Instance variable
    static int num = 5; //static

    void printName(){
        String name="local"; //local variable
        System.out.println(name);
    }

    public static void main(String[] args){
        variablesDemo1 v=new variablesDemo1();
        v.printName();
    }
}
