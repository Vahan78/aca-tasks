package com.company.day8HomeWork;

import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array size");
        int inputArraySize = scanner.nextInt();

        System.out.println("Input numbers");
        int[] array = new int[inputArraySize];          //massivi elementneri mutqagrum (skizb)
        for (int i = 0; i < inputArraySize; i++) {
            array[i] = scanner.nextInt();
        }                                              //massivi elementneri mutqagrum (verj)
        int max = array[0];                            // max popokhakanin veragrenq massivi 1n arjeqy
        int maxIndex = 0;                              //maxIndex - massivi maximal arjeqi indeqsn e


        for (int i = 0; i < inputArraySize - 1; i++) {
            if (array[i + 1] > max) {
                max = array[i + 1];
                maxIndex = i + 1;

            }
        }
        System.out.println("Max value is: " + max + " whit index: " + maxIndex);

    }
}

