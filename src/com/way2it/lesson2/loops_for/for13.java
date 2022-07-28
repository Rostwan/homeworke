package com.way2it.lesson2.loops_for;
import java.util.Scanner;
public class for13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float i = 1;
        double sum = 0;
        if (a > 0){
            for (i = 1;
                 i <= a;
                 i++){
                if (i % 2 == 0 ){
                    sum = sum-(i*0.1+1);
                }else {
                    sum = sum+(i*0.1+1);
                }
            }
        }else {
            System.out.println("error");
        }
        System.out.println(sum);
    }
}