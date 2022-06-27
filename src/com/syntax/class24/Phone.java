package com.syntax.class24;

public abstract class Phone {

    abstract void displayPictures();
    abstract void unlock();
    void sendText(){
        System.out.println("use the messing app to send the mesg");
    }
}

class Iphone extends Phone{

    @Override
    void displayPictures() {
        System.out.println("use the photos app to display the pictures");
    }

    @Override
    void unlock() {
        System.out.println("use Face ID to unlock the phone");
    }
}
class Samsung extends Phone{

    @Override
    void displayPictures() {
        System.out.println("use the Gallery to display the pictures");
    }

    @Override
    void unlock() {
        System.out.println("user finger print sensor or face unlock to unlock your phone");

    }
}
class Tester{
    public static void main(String[] args){
        Samsung samsung=new Samsung();
        samsung.displayPictures();

}}