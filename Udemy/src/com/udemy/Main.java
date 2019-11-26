package com.udemy;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;


      /*  for (int i = 0; i == 10;) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a ");
            returnText(i);
            int num = scanner.nextInt();
            System.out.println("You entered:" + num);
            scanner.nextLine();
            i++;
            sum += num;
        }*/

        int zet = 1;
        while (zet <= 10) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a " + returnText(zet));
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt == false) {
                System.out.println("You entered wrong numb");
            } else {
                int num = scanner.nextInt();
                System.out.println("You entered: " + num);
                scanner.nextLine();
                zet++;
                sum += num;
            }


        }

        System.out.println("Sum of you'r numbers is: " + sum);

    }

    public static String returnText(int number) {
        switch (number) {
            case 1:
                return "first number: ";
            case 2:
                return "second number: ";
            case 3:
                return "third number: ";
            case 4:
                return "fourth number: ";
            case 5:
                return "fifth number: ";
            case 6:
                return "sixth number: ";
            case 7:
                return "seventh number: ";
            case 8:
                return "eighth number: ";
            case 9:
                return "ninth number: ";
            case 10:
                return "tenth number: ";
        }
        return "lol";
    }


}


