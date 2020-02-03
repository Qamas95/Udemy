package com.company;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {

    private String name;
    private int healthPoints;
    private int strength;
    private String weapon;

    public Player(String name, int healthPoints, int strength) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.strength = strength;
        this.weapon = "Axe";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }


    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", healthPoints=" + healthPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1 ,"" + this.healthPoints);
        values.add(2,"" + this.strength);
        values.add(3,"" + this.weapon);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);

           // this.healthPoints = savedValues.get(1); --> tak nie ruszy trzeba parseInt

            this.healthPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);
        }
    }
}
