package com.company.Day9;

import java.util.Scanner;

public class matrixSimmtrycalAboutDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input matrix size");
        //int inputMatrixSize = scanner.nextInt();

        System.out.println("Input matrix elements");
        int[][] matrix = {{1 , 2 , 3} ,{2 , 5 , 4}, {3 , 4 , 6}};

        //matricayi chapseri mutqagrum
//        for (int i = 0; i < matrix.length; i++) {                      //matricayi tarreri mutqagrum (skizb)
//
//            for (int j = 0; j < matrix.length; j++) {
//
//                matrix[i][j] = scanner.nextInt();
//
//            }                                                                  //matricayi tarreri mutqagrum (verj)
//        }
        boolean flag = true;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    continue;
                } else if (!flag) break;
                if (matrix[i][j] != matrix[j][i]) {
                    flag = false;
                    break;
                }
            }
        }

        if(flag) System.out.println("yes");
        else System.out.println("No");
       }
    }





