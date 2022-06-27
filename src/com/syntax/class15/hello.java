package com.syntax.class15;

public class hello {
    void sayHello(String country) {

        String hello;
        switch (country) {
            case "USA":
                hello = "Hola";
                break;
            case "Russia":
                hello = "Privet";
                break;
            case "France":
                hello="bonjour";
                break;
            case "Pakistan":
                hello="Assalam o Alykum";
                break;
            case "India":
                hello="Namastay";
                break;
            case "Turkiye":
                hello="Merhaba";
                break;
            default:
                hello="Country not found";
        }
        System.out.println(hello);
    }
}
