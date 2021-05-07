package com.company.Day4.HomeWork;

import java.util.Scanner;

public class Yntrutyun {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("input Your age");
        int inputYourAge = scanner.nextInt();
        if (inputYourAge > 17) {
            System.out.println("You are eligible to vote ");
        } else {
            System.out.println("You are don`t eligible to vote ");
        }

    }
}