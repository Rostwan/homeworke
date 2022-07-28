package com.way2it.lesson2.files;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class file15 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String fileName1 = sc.nextLine();// name
        int n = sc.nextInt();//variable
        int sum = 0;

        File rootDir = new File("C:\\study\\way2it\\Files");//pass
        if (!rootDir.mkdir())
            System.out.println("Directory already or not created: " + rootDir.getAbsolutePath());//output

        File newFile1 = new File(rootDir, fileName1);
        if (!newFile1.createNewFile())
            System.out.println("File already or not exist: " + newFile1.getAbsolutePath());//output

        PrintStream ps = new PrintStream(newFile1.getAbsolutePath());
        for (int i = 0; i < n; i = i + 1) {
            if (i % 2 == 0 ){
                sum += i;
            }
        }
        ps.print(sum);
    }
}


