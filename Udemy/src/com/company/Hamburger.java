package com.company;

public class Hamburger {

    private String name;
    private int bread_roll_type;
    private boolean withMeat;
    private boolean tomato;
    private boolean lettuce;
    private boolean carrot;

    private int price = 0;

    public Hamburger(String name, int bread_roll_type, boolean withMeat, boolean tomato, boolean lettuce, boolean carrot) {
        this.name = "Classic";
        this.bread_roll_type = bread_roll_type;
        this.withMeat = withMeat;
        this.tomato = tomato;
        this.lettuce = lettuce;
        this.carrot = carrot;
    }

    public int countPrice_total(){
        if(bread_roll_type == 1) {
            price += 2;
        } else if (bread_roll_type == 2) {
            this.price += 4;
        } else if (bread_roll_type == 3) {
            this.price += 6;
        } else if (bread_roll_type == 4) {
            this.price += 8;
        }
        if(withMeat){
            price +=2;
        }
        if(tomato){
            price +=3;
        }
        if(lettuce) {
            price +=4;
        }
        if(carrot){
            price+=4;
        }
        return getPrice();
    }


    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
