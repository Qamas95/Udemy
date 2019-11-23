package com.udemy;

public class LargestPrime {


    public static int getLargestPrime(int number){


        if(number > 1) {
            int num = 2;
            while(num < number) {
                if(number % num == 0) {
                    number = number / num;
                } else num++;
            }
            System.out.println(number);
            return number;

        }
        return -1;


 /*       for(int i=1; i<=number; i++){
            if(number%i ==0 && i!=number){
                System.out.println(i);


            }
        }*/

  /*      int counter = 0;
        int num = 0;

        for (int i=1; i<=number; i++) {
            if(number%i == 0) {
                counter = counter + 1;
            }

        }

     //   System.out.println(counter);
        if (number < 0 || counter != 2) {
            return -1;
        } else {
            System.out.println("essa");
            return 1;
        }*/

    }


}
