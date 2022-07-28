package com.way2it.flowers;

public class main{
    public static void main(String[] args) {
        flower flower0 = new flower();
        flower flower1 = new rose();
        flower flower2 = new sunflower();
        flower flower3 = new lili();

        flower1.price = 60;
        flower1.color = "red";
        flower0.color = "blue";
        flower0.price = 5;
        flower2.price = 10;
        flower2.color = "yellow";
        flower3.price = 30;
        flower3.color = "white";
        int value = flower0.price+flower1.price+flower2.price+flower3.price;
        System.out.println("the prise is "+value);
    }
}


