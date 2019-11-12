package com.udemy;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        int numm = number;

        if (number < 0) {
            return -1;
        } else {

            while (numm >= 10) {
                numm /= 10;

            }

            int num = number % 10;
            //System.out.println(num);
            return num + numm;

        }

    }


}
