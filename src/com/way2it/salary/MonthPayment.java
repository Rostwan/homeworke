package com.way2it.salary;

public class MonthPayment implements Salary{
    public int amountInMonth;

    public MonthPayment(int amountInMonth) {
        this.amountInMonth = amountInMonth;
    }

    @Override
    public void salary() {
        System.out.println("Month payment salary in a year is "+amountInMonth*12);
    }
}
