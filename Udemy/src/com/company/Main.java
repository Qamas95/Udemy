package com.company;



public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Classic",4,true,true,true,true);

        System.out.println(hamburger.countPrice_total());

        HealthlyBurger healthlyburger = new HealthlyBurger(true,true,true,true,true);
        System.out.println(healthlyburger.countPrice_total());

        PremiumBurger premiumBurger = new PremiumBurger(4,true,true,true,true,true,true,true);
        System.out.println(premiumBurger.countPrice_total());

    }


}

