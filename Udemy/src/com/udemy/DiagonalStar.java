package com.udemy;


public class DiagonalStar {

    public static void printSquareStar(int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
        } else {

            for (int i = 0; i < number; i++) {
                for (int j = 0; j < number; j++) {
                    if (i == 0 || j == 0 || i == j || i == number - 1 || j == number - 1 || i + j == number - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();

            }

        }
    }






 /*       String star = "*";
        int num = Integer.parseInt(star);
        System.out.println(num);

        if(number < 5) {
            System.out.println("Invalid Value");
        } else {

            for(int i = 0; i<=number; i++){
                for(int j =0; j<=number; j++) {
                  //  System.out.println("*");
                }

            }

        }*/

}


