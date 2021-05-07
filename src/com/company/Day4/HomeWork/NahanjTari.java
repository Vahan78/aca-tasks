package com.company.Day4.HomeWork;

import java.util.Scanner;

public class NahanjTari {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas, input year");
        int inputYear = scanner.nextInt();

        if (inputYear % 4 ==0 && inputYear % 100 != 0)
            System.out.println("Input year is leap");
            else {
            if (inputYear % 400 == 0)
                System.out.println("Input year is leap");

            else {
                System.out.println("Input year is not leap");
            }
        }

    }
}