package com.company.day8HomeWork;

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array size");
        int inputArraySize = scanner.nextInt();
        int[] array = new int[inputArraySize];

        System.out.println("Input numbers");
        for (int i = 0; i < inputArraySize; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < inputArraySize; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }

        }
    }
}




