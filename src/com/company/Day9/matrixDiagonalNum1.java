package com.company.Day9;

import java.util.Scanner;

public class matrixDiagonalNum1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input matrix size");
        int inputMatrixSize = scanner.nextInt();
        int[][] matrix = new int[inputMatrixSize][inputMatrixSize];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                } else matrix[i][j] = 0;

            }

        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();

        }

    }


}

