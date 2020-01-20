package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Mechanism weeds = new Mechanism("Mazar");


    public static void main(String[] args) {

        boolean quit = false;

        while (!quit){
            System.out.println("Enter action:");
        int actions = scanner.nextInt();
        scanner.nextLine();
        switch (actions){
            case 0:
                addNewWeed();
                break;
            case 1:
                weeds.printWeedTypes();
                break;
            case 2:
                printOptions();
                break;
            case 3:
                quit = true;
                break;
        }
        }
    }

    private static void printOptions(){
        System.out.println("0 - add new options\n" +
                "1 - print list\n" +
                "2 - quit");
    }

    private static void addNewWeed(){
        System.out.println("Enter weed name: ");
        String weedName = scanner.nextLine();
        System.out.println("Enter weed price per 1g: ");
        int weedPrice = scanner.nextInt();
        scanner.nextLine();
        Weed newWeeedType = Weed.createWeed(weedName,weedPrice);
        if(weeds.addNewWeedType(newWeeedType)){
            System.out.println("New weed type added: " + weedName + " for price: " + weedPrice);
        } else {
            System.out.println("Cannot add, " + weedName + " already on file");
        }
    }

}