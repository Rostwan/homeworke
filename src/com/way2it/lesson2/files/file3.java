package com.way2it.lesson2.files;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class file3 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();// name
        double a = sc.nextInt();//variable
        double d = sc.nextInt();//variable

        File rootDir = new File("C:\\study\\way2it\\Files");//pass
        if (!rootDir.mkdir()) System.out.println("Directory already or not created: "+ rootDir.getAbsolutePath());//output

        File newFile = new File(rootDir,fileName);
        if (!newFile.createNewFile()) System.out.println("File already or not exist: " + newFile.getAbsolutePath() );//output

        PrintStream ps = new PrintStream(newFile.getAbsolutePath());
         for (double i = 1; i <= 10; i++){
             a += i * d;
             ps.print(a + " ");
        }
        ps.close();
    }
}

