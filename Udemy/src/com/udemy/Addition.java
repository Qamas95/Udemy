package com.udemy;

public class Addition extends Calculator implements PrintText {


    public Addition(double a, double b) {
        super(a, b, "addition");
    }

    @Override
    public void addition() {
        double score = getA() + getB();
        System.out.println(text() + score);
    }

    @Override
    public String text() {
        return "Score of " + getName() + " is: ";
    }
}
