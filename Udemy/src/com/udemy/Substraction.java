package com.udemy;

public class Substraction extends Calculator implements PrintText {

    public Substraction(double a, double b) {
        super(a, b, "substraction");
    }

    @Override
    public void substraction() {
        double score = getA() - getB();
        System.out.println(text() + score);
    }

    @Override
    public String text() {
        return "Score of " + getName() + " is: ";
    }
}
