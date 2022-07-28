package com.way2it.lesson2.while_loops;
import java.util.Scanner;
public class while7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 0;
        if (n > 0) {
            //while (k*k <= n){
                for (k = 0; k*k < n; k++){
                    k++;

              //  }
            }
            System.out.println(k);
        }else {
            System.out.println("error");
        }
    }
}


