package com.company;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        sortArrays(printArray(getArrays(8)));
    }

    public static void sortArrays(int[] returnedArrays) {
        Arrays.sort(returnedArrays);
        System.out.println("Sorted array numbers: " + Arrays.toString(returnedArrays));
    }

    public static int[] printArray(int[] array) {
        int[] myIntegers = array;
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        return myIntegers;
    }

    public static int[] getArrays(int number) {
        System.out.println("Enter " + number + " a integer values.\r");
        int[] enteredValues = new int[number];

        for (int i = 0; i < enteredValues.length; i++) {
            enteredValues[i] = scanner.nextInt();
        }
        return enteredValues;
    }

}

