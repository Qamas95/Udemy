package com.company;

public class Weed {

    private String name;
    private int price_1g;

    public Weed(String name, int price_1g) {
        this.name = name;
        this.price_1g = price_1g;
    }

    public String getName() {
        return name;
    }

    public int getPrice_1g() {
        return price_1g;
    }


    public static Weed createWeed(String name, int price_1g){
        return new Weed(name,price_1g);
    }


}
