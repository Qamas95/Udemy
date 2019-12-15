package com.udemy;


public class Main {
    public static void main(String[] args) {


        EnhancedPlayer player = new EnhancedPlayer("Qamas",100, "Axe");
        System.out.println("Initial health is " + player.getHitPoints());

/*  Bad way to do this
        Player player = new Player();

        player.fullName = "Qamas";
       // player.health = 100;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 20;
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

*/

    }

}

