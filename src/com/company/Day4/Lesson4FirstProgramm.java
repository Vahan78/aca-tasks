package com.company.Day4;

import java.util.Scanner;

public class Lesson4FirstProgramm {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("input number");
        int inputNumber = scanner.nextInt();
        if (inputNumber == 98) {
            System.out.println("very good");
        } else if (inputNumber == 70) {
            System.out.println("good");
        } else if (inputNumber == 50) {
            System.out.println("50/50");
        } else if (inputNumber == 30) {
            System.out.println("bad");
        } else if (inputNumber == 20) {
            System.out.println("very bad");
        } else if (inputNumber == 0) {
            System.out.println("You is dead");


        } else {
            System.out.println("New test");
        }

    }
}



