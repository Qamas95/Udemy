package com.company;


import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        ArrayList<Integer> items = new ArrayList<Integer>();
        items.add(1);
        items.add(2);
        items.add(3);
     //   items.add("essa");
        items.add(5);

        printDoubled(items);
    }

  /*  private static void printDoubled(ArrayList<Integer> n) {
        for(Object i : n) {
            System.out.println((Integer) i * 2);
        }
    }*/

    private static void printDoubled(ArrayList<Integer> n) {
        for(int i : n) {
            System.out.println(i * 2);
        }
    }
}