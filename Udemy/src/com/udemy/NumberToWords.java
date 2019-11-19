package com.udemy;

public class NumberToWords {

    public static int reverse(int number) {
        int reversedNum = 0;
        while (number != 0) {
            reversedNum = reversedNum * 10 + number % 10;
            number = number / 10;
        }
        return reversedNum;

    }

    public static int getDigitCount(int number) {
        if (number == 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {

            int count = 0;
            while (number > 0) {
                number = number / 10;
                count++;
            }

            return count;
        }
    }

/*    public static void testkuraw(int number) {
        if (number == 0) {
            System.out.println("Zero");
        } else if (number < 0) {
            System.out.println("Invalid Value");
        } else{
            int lastDigit = 0;
            int num = number;

            lastDigit = num % 10;
            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }
    }*/

    public static void numberToWords(int number) {

        if (number == 0) {
            System.out.println("Zero");
        } /*else if(number == 10) {
            System.out.println("One Zero");
        }*/ else if (number < 0) {
            System.out.println("Invalid Value");
        } else {

            int lastDigit = 0;
            int num = reverse(number);
            int lol = 0;
            lol = getDigitCount(number) - getDigitCount(num);


            while(num > 0) {
                lastDigit = num % 10;
             switch (lastDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }

                num /= 10;


            }
            if(lol > 0) {
                for(int i = 1; i <=lol; i++){
                    System.out.println("Zero");
                }
            }


        }


/*    public static void numbersToWords(int number) {

        if (number == 0) {
            System.out.println("Zero");

        }
        int lastDigit;
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int num = number;

            lastDigit = num % 10;
            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }


        }
    }

    public static void numberToWords(int number) {

        if (number > 0) {
            numberToWords(number / 10);
            switch (number % 10) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }
    }*/





  /*  public static void numberToWords(int number) {

        int count = 0;
        int numm = number;
        int lol = 0;
        while (number > 0) {
            count++;
            number = number / 10;
        }
        double num = Math.pow(10, count - 1);
        int i = (int) num;
        for (; i > 0; i /= 10) {
            lol = numm / i % 10;

            switch (lol) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }

        }
    }*/

  /*      int num = number;
        int lastDigit = 0;
        int reverse = 0;
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {

            if(num > 0) {
                while (num > 0) {

                    lastDigit = num % 10;
                    reverse = (reverse * 10) + lastDigit;
                num /= 10;
                }

                System.out.println(lastDigit);

            }*/


       /*     while (num > 0) {
                if (num > 0) {
                    lastDigit = num % 10;

                }
                num = num / 10;
                reverse = (reverse * 10) + lastDigit;

                System.out.println(reverse);
            }*/


    /*    int lastDigit =0;
        int num = number;

        if (number < 0) {
            System.out.println("Invalid Value");
        } else {

            lastDigit = num % 10;
            System.out.println(lastDigit);
            while (num > 0) {

                lastDigit = num % 10;



                switch (num) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }


                num = num /10;

            }




        }*/
    }
}



