package com.udemy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();

        placesToVisit.add("Krakow");
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
        printList(placesToVisit);

    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i= linkedList.iterator();
        while (i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("____________________");
    }


    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()){
            int comparsion = stringListIterator.next().compareTo(newCity);
            if(comparsion == 0) {
                // equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if(comparsion > 0) {
                //new city should appear before this one
                stringListIterator.previous();
                stringListIterator.add(newCity);
             return true;
            } else if (comparsion < 0) {
                // move on next city
            }
        }
            stringListIterator.add(newCity);
    }

}
