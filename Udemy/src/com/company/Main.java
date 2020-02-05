package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button btbPrint = new Button("Print");


    public static void main(String[] args) {

/*        class ClickListener implements Button.OnClickListener {
            public ClickListener() {
                System.out.println("I've been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        }

        btbPrint.setOnClickListener(new ClickListener());
       */

        btbPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });
        listen();

  /*      GearBox skoda = new GearBox(5);
        skoda.operateClutch(true);
        skoda.changeGear(1);
        skoda.operateClutch(false);
        System.out.println(skoda.wheelSpeed(1000));
        skoda.changeGear(2);
        System.out.println(skoda.wheelSpeed(1000));
        skoda.operateClutch(true);
        skoda.changeGear(3);
        skoda.operateClutch(false);
        System.out.println(skoda.wheelSpeed(6000));



*/
    }


    private static void listen() {
        boolean quit = false;
        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btbPrint.onClick();
            }
        }
    }

}