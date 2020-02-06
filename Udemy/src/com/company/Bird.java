package com.company;

public abstract class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }
    @Override
    public void eat() {
        System.out.println(getName() + " is eating.");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public abstract void fly();



}
