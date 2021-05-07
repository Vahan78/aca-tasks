package com.company.Day4.HomeWork;

import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner (System.in);

        System.out.println("Pleas, input number ");
        int InputNumber = scanner.nextInt();

        int d = InputNumber % 7 + 1;
        if (d == 1)
          System.out.println("Monday");
        if (d == 2)
            System.out.println("Tuesday");
        if (d == 3)
            System.out.println("Wednesday");
        if (d == 4)
            System.out.println("Thursday");
        if (d == 5)
            System.out.println("Friday");
        if (d == 6)
            System.out.println("Saturday");
        if (d == 7)
            System.out.println("Saturday");



    }
}
