package com.udemy;

public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year){
        int test = 0;
        if((year > 0 && year < 9999) && (year % 4 == test) && (((year % 4 == test) && (year % 100 != 0) || (year % 400 == 0)))){
            return true;
        } return false;

    }


    public static int getDaysInMonth(int month, int year){

        if(month < 1 || month > 12 || year < 1 || year > 9999){
            return -1;
        }
    /*    if((month < 1 || month > 12) && (year < 1 || year > 999)){
            return -1;
        }*/
            if (isLeapYear(year) == true){
            switch (month){
                case 1:
                    System.out.println("31 since January has 31 days");
                    return 31;
                case 2:
                    System.out.println("29 since February has 29 days in a leap year and 2020 is a leap year");
                    return 29;
                case 3:
                    System.out.println("31 since March has 31 days");
                    return 31;
                case 4:
                    System.out.println("30 since April has 30 days");
                    return 30;
                case 5:
                    System.out.println("31 since May has 31 days");
                    return 31;
                case 6:
                    System.out.println("30 since June has 30 days");
                    return 30;
                case 7:
                    System.out.println("31 since July has 31 days");
                    return 31;
                case 8:
                    System.out.println("31 since August has 31 days");
                    return 31;
                case 9:
                    System.out.println("30 since September has 30 days");
                    return 30;
                case 10:
                    System.out.println("31 since October has 31 days");
                    return 31;
                case 11:
                    System.out.println("30 since November has 30 days");
                    return 30;
                case 12:
                    System.out.println("31 since December has 31 days");
                    return 31;

            }

        } else if(isLeapYear(year) == false) {
            switch (month){
                case 1:
                    System.out.println("31 since January has 31 days");
                    return 31;
                case 2:
                    System.out.println("28 since February has 28 days");
                    return 28;
                case 3:
                    System.out.println("31 since March has 31 days");
                    return 31;
                case 4:
                    System.out.println("30 since April has 30 days");
                    return 30;
                case 5:
                    System.out.println("31 since May has 31 days");
                    return 31;
                case 6:
                    System.out.println("30 since June has 30 days");
                    return 30;
                case 7:
                    System.out.println("31 since July has 31 days");
                    return 31;
                case 8:
                    System.out.println("31 since August has 31 days");
                    return 31;
                case 9:
                    System.out.println("30 since September has 30 days");
                    return 30;
                case 10:
                    System.out.println("31 since October has 31 days");
                    return 31;
                case 11:
                    System.out.println("30 since November has 30 days");
                    return 30;
                case 12:
                    System.out.println("31 since December has 31 days");
                    return 31;

            }

        }
        return 1;
    }


}



