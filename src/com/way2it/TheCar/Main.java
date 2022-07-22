package com.way2it.TheCar;

public class Main {
    public static void main(String[] args) {
        Body body = new Body("race",55,"harsh");
        SteeringWheel steeringWheel = new SteeringWheel("sport",25,"sharp");
        Wheel wheel = new Wheel("sport","soft",20);
        Car porsche = new Car(34,"car",250,body,steeringWheel,wheel);

        porsche.increaseHeightBy(2);
        System.out.println("This car:" + porsche);

    }
}
