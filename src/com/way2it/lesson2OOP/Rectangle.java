package com.way2it.lesson2OOP;

public class Rectangle {

        private int length = 3;
        private int width = 4;
        private int sqr = 3*4;
        private int perimeter = 2*(length+width);
        public void area() {
            System.out.println("area is "+sqr);
            System.out.println("perimeter is "+ perimeter);
        }

}
