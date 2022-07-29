package com.way2it.salary;

public class HourPayment implements Salary {
    public int amountInHour ;

    public HourPayment(int amountInHour) {
        this.amountInHour = amountInHour;
    }

    @Override
    public void salary() {
        System.out.println("Hour payment salary in a year is "+amountInHour*260*8);
    }
}
