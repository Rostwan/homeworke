package com.way2it.lesson2.loops_for;
import java.util.Scanner;

public class case2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        switch (marks) {
            case 1 -> System.out.println("плохо");
            case 2 -> System.out.println("неудовлетворительно");
            case 3 -> System.out.println("удовлетворительно");
            case 4 -> System.out.println("хорошо");
            case 5 -> System.out.println("отлично");
            default -> System.out.println("ошибка");
        }
    }
}
