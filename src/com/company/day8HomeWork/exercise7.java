package com.company.day8HomeWork;

import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array size");
        int inputArraySize = scanner.nextInt();

        System.out.println("Input numbers");
        int[] array = new int[inputArraySize];
        for (int i = 0; i < inputArraySize; i++) {
            array[i] = scanner.nextInt();
        }
        int min = array[0];
        for (int i = 0; i < inputArraySize - 1; i++) {
            if (array[i + 1] < min && array[i + 1] > 0) {
                min = array[i + 1];
            }
        }


            System.out.println("Positive min valu is:" + min);

        }


    }


