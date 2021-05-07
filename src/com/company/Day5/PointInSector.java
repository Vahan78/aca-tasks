package com.company.Day5;

import java.util.Scanner;

public class PointInSector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas, input your number");

        int InputNumber = scanner.nextInt();
        switch (InputNumber / 45) {
            case 0:

                System.out.println("Your point is in 0-44");
                break;
            case 1:

                System.out.println("Your point is in 45-89");
                break;
            case 2:

                System.out.println("Your point is in 90-134");
                break;

            default:
                System.out.println("Your point is out of range");
        }


    }
}
