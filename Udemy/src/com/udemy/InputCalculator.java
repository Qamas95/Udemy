package com.udemy;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {

        int sum = 0;
        int iteracje = 0;
        double average = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            //  System.out.println("Enter a number: ");
            boolean isInt = scanner.hasNextInt();
            if (isInt == true) {
                int number = scanner.nextInt();
                sum += number;
                iteracje++;
                average = (double) sum / (double) iteracje;
                average = Math.round(average);

            } else {
                int avgToInt = (int) average;
                System.out.println("SUM = " + sum + " AVG = " + avgToInt);
                break;
            }
            scanner.nextLine();
        }

        scanner.close();

    }
}
