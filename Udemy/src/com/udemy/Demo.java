package com.udemy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();

        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Krakow");
        addInOrder(placesToVisit, "Warszawa");
        addInOrder(placesToVisit, "Poznan");
        addInOrder(placesToVisit, "Szczecin");
        addInOrder(placesToVisit, "Lodz");
        addInOrder(placesToVisit, "Gadnsk");
        addInOrder(placesToVisit, "Gdynia");
        addInOrder(placesToVisit, "Sopot");
        addInOrder(placesToVisit, "Wroclaw");
        addInOrder(placesToVisit, "Adelaide");

        printList(placesToVisit);


        addInOrder(placesToVisit, "Alice Springs");
        addInOrder(placesToVisit, "Poznan");

        printList(placesToVisit);
        visit(placesToVisit);

 /*       placesToVisit.add("Krakow");
        placesToVisit.add("Warszawa");
        placesToVisit.add("Poznan");
        placesToVisit.add("Wroclaw");
        placesToVisit.add("Sopot");
        placesToVisit.add("Szczecin");
        placesToVisit.add("Kolobrzeg");

        printList(placesToVisit);

        placesToVisit.add(1, "Sydney");

        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);*/

    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("____________________");
    }


    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparsion = stringListIterator.next().compareTo(newCity);
            if (comparsion == 0) {
                // equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparsion > 0) {
                //new city should appear before this one
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparsion < 0) {
                // move on next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }


    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()) {
            System.out.println("No cities in the itenerary");
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Holiday (Vacation) over");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;

            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - go to next city\n" +
                "2 - go to previous city" +
                "3 - print menu options");
    }

}
