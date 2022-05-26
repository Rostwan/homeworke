package com.way2it.lesson2OOP;

public class Circle {
    private double diameter = 10;
    private double radius = 5;
    private double circ_sqr = 3.14*radius*radius;
    private double circ_length = 3.14*diameter;
    public void circle(){
        System.out.println("Area of a circle is " + circ_sqr);
        System.out.println("Length of a circle is " + circ_length);
    }

}
