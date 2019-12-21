package com.udemy;

public class HealthlyBurger extends Hamburger {


    private String healthlyExtra1Name;
    private double healthlyExtra1Price;

    private String healthlyExtra2Name;
    private double healthlyExtra2Price;

    public HealthlyBurger(String meat, double price) {
        super("Healthly", meat, price, "Brown rye");

    }

    public void addHealthAddition1(String name, double price){
        this.healthlyExtra1Name = name;
        this.healthlyExtra1Price = price;
    }

    public void addHealthAddition2(String name, double price){
        this.healthlyExtra2Name = name;
        this.healthlyExtra2Price = price;
    }










}
