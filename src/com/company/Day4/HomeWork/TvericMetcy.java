package com.company.Day4.HomeWork;

import java.util.Scanner;

public class TvericMetcy {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("input Number A");
        int inputNumberA = scanner.nextInt();

        System.out.println("input Number B");
        int inputNumberB = scanner.nextInt();

        System.out.println("input Number C");
        int inputNumberC = scanner.nextInt();
        int x = inputNumberA;
        if (x < inputNumberB)
             x = inputNumberB;

        if (x < inputNumberC)
             x = inputNumberC;
        System.out.println(x);
    }
}




