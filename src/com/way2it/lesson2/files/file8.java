package com.way2it.lesson2.files;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class file8 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String fileName1 = sc.nextLine();// name
        String fileName2 = sc.nextLine();// name
        int n = sc.nextInt();//variable

        File rootDir = new File("C:\\study\\way2it\\Files");//pass
        if (!rootDir.mkdir())
            System.out.println("Directory already or not created: " + rootDir.getAbsolutePath());//output

        File newFile1 = new File(rootDir, fileName1);
        File newFile2 = new File(rootDir, fileName2);
        if (!newFile1.createNewFile())
            System.out.println("File already or not exist: " + newFile1.getAbsolutePath());//output

        PrintStream ps = new PrintStream(newFile1.getAbsolutePath());
        for (int i = 0; i < n; i = i + 1) {
            ps.print(i + " ");
        }
        ps.close();
        PrintStream prs = new PrintStream(newFile2.getAbsolutePath());

        prs.print(fileName1.lastIndexOf(fileName1));

        prs.close();

    }
}


