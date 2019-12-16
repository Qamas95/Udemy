
package com.company;

public class HealthlyBurger extends Hamburger {


    private boolean withSouce;
    private boolean withFries;
    private int extra_price;

    public HealthlyBurger(boolean tomato, boolean lettuce, boolean carrot, boolean withSouce, boolean withFries) {
        super("HealthyBurger", 4, false, tomato, lettuce, carrot);
        this.withSouce = true;
        this.withFries = true;
    }


    @Override
    public int countPrice_total() {
        return super.countPrice_total()+ getExtra_price();
    }

    public int extra_price() {
        if (withSouce == false) {
            extra_price += 2;
        }
        if (withFries == false) {
            extra_price += 2;
        }
        return extra_price;
    }

    public int getExtra_price() {
        return extra_price;
    }
}

