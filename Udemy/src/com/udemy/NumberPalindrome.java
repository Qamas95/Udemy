package com.udemy;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        int reverse = 0;
        int lastDigit = 0;
        int num = number;

        if (num > 0) {
            while (num > 0) {

                lastDigit = num % 10;
                reverse = (reverse * 10) + lastDigit;
                num /= 10;
            }

            if (number == reverse) {
                return true;
            } else return false;
        } else {
            while (num < 0) {

                lastDigit = num % 10;
                reverse = (reverse * 10) + lastDigit;
                num /= 10;
            }

            if (number == reverse) {
                return true;
            } else return false;
        }

    }

}
