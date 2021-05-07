package com.company.Day4.HomeWork;

import java.util.Scanner;

public class Hngapatik {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("input Number");
        int inputNumber = scanner.nextInt();
        if (inputNumber % 5 == 0){
            System.out.println("Bajanvum e 5i");}
        else {
            System.out.println("chi bajanvum 5i");
        }
    }
}


