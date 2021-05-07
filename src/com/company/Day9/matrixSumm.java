package com.company.Day9;

import java.util.Random;

public class matrixSumm {
    public static void main(String[] args) {
        int[][] matrix = new int[10][15];
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = random.nextInt(20) + 85;
            }
        }
        int sumRowe = 0;
        int sumMatrix = 0;
        for (int i = 0; i < matrix.length; i++) {

            sumRowe = 0;
            for (int j = 0; j < matrix.length; j++) {
                sumRowe = sumRowe + matrix[i][j];
            }

            sumMatrix += sumRowe;
            System.out.println("Rowe " + i + " sum is " + sumRowe);
        }

        System.out.println("Matrix sum is:" + sumMatrix);

    }
}

