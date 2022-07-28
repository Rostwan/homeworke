package com.way2it.lesson2.loops_for;
import java.util.Scanner;
public class for12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float i = 1;
        float sum = 0;
        if (a > 0){
            for (i = 1;
                 i <= a;
                 i++){
                sum = sum+(1*i);
            }
        }else {
            System.out.println("error");
        }
        System.out.println(sum);
    }
}