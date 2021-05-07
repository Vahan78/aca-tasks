package com.company.Day4.HomeWork;

import java.util.Random;

public class Random2To7 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt();
        if(randomNumber < 0){
            randomNumber = randomNumber * -1;
        }

        System.out.println(randomNumber%6 + 2);
    }

}
