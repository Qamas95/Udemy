package com.udemy;


public class Main {
    public static void main(String[] args) {


        Hamburger hamburger = new Hamburger("Bassic","Sausage",3.65,"White");
        //double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato",0.27);
        hamburger.addHamburgerAddition2("Lettuce",0.75);
        hamburger.addHamburgerAddition3("Cucumber",0.5);
        hamburger.addHamburgerAddition4("Cheese",1.12);
        System.out.println("Total burger price is " + hamburger.itemizeHamburger());

        HealthlyBurger healthlyBurger = new HealthlyBurger("Bacon",5.67);
        healthlyBurger.itemizeHamburger();
        healthlyBurger.addHealthAddition1("Egg",3);
        healthlyBurger.itemizeHamburger();

    }

}

