package com.udemy;

public class Calculator implements Functions {

    private double a;
    private double b;
    private String name;

    public Calculator(double a, double b, String name) {
        this.a = a;
        this.b = b;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public void addition() {
        Addition addition = new Addition(getA(), getB());
        addition.addition();
    }

    @Override
    public void substraction() {
        Substraction substraction = new Substraction(getA(), getB());
        substraction.substraction();
    }

    @Override
    public void multiplication() {
        Multiplication multiplication = new Multiplication(getA(), getB());
        multiplication.multiplication();
    }

    @Override
    public void division() {
        Division division = new Division(getA(), getB());
        division.division();
    }
}
