package com.company;

public class PremiumBurger extends Hamburger {

    private boolean fries;
    private boolean cola;
    private boolean doubleMeat;

    private int extra_price;

    public PremiumBurger(int bread_roll_type, boolean withMeat, boolean tomato, boolean lettuce, boolean carrot, boolean fries, boolean cola, boolean doubleMeat) {
        super("Premium", bread_roll_type, withMeat, tomato, lettuce, carrot);
        this.fries = true;
        this.cola = true;
        this.doubleMeat = true;
    }

    public int extra_price() {
        if (fries) {
            extra_price += 2;
        }
        if (cola) {
            extra_price += 2;
        }
        if(doubleMeat){
            extra_price += 10;
        }
        return extra_price;
    }

    @Override
    public int countPrice_total() {
        return super.countPrice_total() + getExtra_price();
    }

    public int getExtra_price() {
        return extra_price;
    }
}
