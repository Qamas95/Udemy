package com.udemy;

public class VipCustomer {

    private String name;
    private double credit_limit;
    private String email;

    public VipCustomer(){
        this("Default name", 50000.00,"deafult@gmail.com");
    }


    public VipCustomer(String name, double credit_limit) {
        this(name,credit_limit,"unknown@gmail.com");
    }

    public VipCustomer(String name, double credit_limit, String email) {
        this.name = name;
        this.credit_limit = credit_limit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCredit_limit() {
        return credit_limit;
    }

    public String getEmail() {
        return email;
    }
}
