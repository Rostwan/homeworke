package com.way2it.OOP.Robots;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.work();
        Robot coffeerobot = new CoffeeRobot();
        coffeerobot.work();
        Robot robotdancer = new RobotDancer();
        robotdancer.work();
        Robot arr [] = {robot, coffeerobot, robotdancer};

        for (int i=0; i<3; i++){
            arr[i].work();
        }

    }
}
