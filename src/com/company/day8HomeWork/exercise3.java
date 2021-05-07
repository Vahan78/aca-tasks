package com.company.day8HomeWork;

import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input array size");
        int inputArraySize = scanner.nextInt();
        int []array = new int[inputArraySize];

        System.out.println("input numbers");
        for (int i = 0; i < inputArraySize; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < inputArraySize; i++) {
            if(array[i] >= 0) {
                System.out.print(array[i] + ";" );
            }
        }

    }
}
