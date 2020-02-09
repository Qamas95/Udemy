package com.udemy;

public class Division extends Calculator implements PrintText {

    public Division(double a, double b) {
        super(a, b, "division");
    }

    @Override
    public void division() {
        double score = getA() / getB();
        System.out.println(text() + score);
    }

    @Override
    public String text() {
        return "Score of " + getName() + " is: ";
    }
}


