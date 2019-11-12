package com.udemy;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        } else {

            int num = number;
            int lastDigit = 0;
            int add = 0;

            while (num > 0) {

                lastDigit = num % 10;
               // System.out.println(lastDigit);

                if ((lastDigit % 2 == 0)) {
                    add += lastDigit;
                  //  System.out.println(add);
                    num /=10;
                } else {
                    num /= 10;
                    //System.out.println(num);
                }
            }

            return add;

        }


    }
}