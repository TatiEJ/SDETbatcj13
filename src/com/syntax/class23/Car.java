package com.syntax.class23;

public class Car {
    void start() {
        System.out.println("use keys to start me");
    }

    void stop() {
        System.out.println("use breaks to stop me");
    }

    void park() {
        System.out.println("you can park me manually");
    }
}
class BMW extends Car{
    @Override
    void start() {
        super.start();
        System.out.println("you can use push start button to start me ");
    }

    @Override
    void stop() {
        super.stop();
        System.out.println("you can use auto breaking or manual brakes to stop me ");
    }
}
class Tesla extends Car{
    @Override
    void start() {
        super.start();
        System.out.println("you can start me from app");
    }

    @Override
    void stop() {
        super.stop();
        System.out.println("you can use auto breaking to stop me");
    }

    @Override
    void park() {
        super.park();
        System.out.println("I can park myself");
    }
}

class Toyota extends Car {

}