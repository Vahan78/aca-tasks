package com.company.day8HomeWork;

import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input array size");
        int inputArraySize = scanner.nextInt(); // mutqagrecinq massivi chapy
        int []array = new int[inputArraySize];  // steghceciq "array" masiv trvac chapov

        System.out.println("Input numbers");
        for (int i = 0; i < inputArraySize; i++) {     // mutqagrum enq massivi tvery
            array[i] = scanner.nextInt();
                   }
        for (int i=0; i< inputArraySize-1; i++) {
            if (array[i+1] > array[i]) {
                System.out.println(array[i+1]);
            }
        }


    }
}
