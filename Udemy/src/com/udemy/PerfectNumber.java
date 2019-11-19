package com.udemy;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {
        int z = 0;
        if (number < 1) {
            return false;
        } else {

            for (int i = 1; i <= number - i; i++) {
                if (number % i == 0) {
                    z += i;
                }
            }

            if (z == number) {

                System.out.println(z);
                return true;
            } else

                return false;
        }


    }


}
