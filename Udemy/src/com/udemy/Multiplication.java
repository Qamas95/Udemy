package com.udemy;

public class Multiplication extends Calculator implements PrintText {

    public Multiplication(double a, double b) {
        super(a, b, "multiplication");
    }

    @Override
    public void multiplication() {
        double score = getA() * getB();
        System.out.println(text() + score);
    }


    @Override
    public String text() {
        return "Score of " + getName() + " is: ";
    }
}
