package com.way2it.salary;

public class Main {
    public static void main(String[] args) {
        HourPayment hourPayment = new HourPayment((int) 62.5);
        MonthPayment monthPayment = new MonthPayment(11000);
        hourPayment.salary();
        monthPayment.salary();
    }
}
