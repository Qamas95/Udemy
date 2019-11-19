package com.udemy;

public class FactorPrinter {

    public static void printFactors(int number) {

        if(number < 1){
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= number; i++) {

                if(number%i == 0) {
                    System.out.println(i);
                }
            }

        }

    }
/*
        int z = 1;
        if(number < 1){
            return "Invalid Value";
        } else {
            while(z >= 1) {

                 z = number;
                 for(int i = 1; i <=z; i++){

                     if(z%i == 0) {
                         System.out.println(z);
                     }
                     z = z-1;
                 }


            }

        } return "ok";
    }
*/

    
}
