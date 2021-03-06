package com.syntax.class24;

public abstract class Database {

    abstract void open();
    abstract void readData();
    abstract boolean whiteData();
    public void closeTheDatabase(){
        System.out.println("Terminate the connection to clase it");
    }

}
class Informix extends Database{

    @Override
    void open() {
        System.out.println("Opening the Informix database class");
    }

    @Override
    void readData() {
        System.out.println("Reading the data from the Informix");
    }

    @Override
    boolean whiteData() {
        System.out.println("data written successfully ");
        return false;
    }
}
class MySQLServer extends Database{

    @Override
    void open() {
        System.out.println("Opening the MySQLServer database class");
    }

    @Override
    void readData() {
        System.out.println("Reading the data from the MySQLServer");
    }

    @Override
    boolean whiteData() {
        System.out.println("data written successfully ");
        return false;
}
}