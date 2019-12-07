package com.udemy;

public class Company {

    private String employee_name;
    private String employee_surname;
    private int employee_age;
    private int employee_account_cash_balance;
    private String employee_email;


    public Company(){
        this("Qarcia","Rosiek",25,5000,"@op.pl");
        System.out.println("Empty constructor");
    }

    public Company(String employee_name, String employee_surname, int employee_age, int employee_account_cash_balance, String employee_email){
        System.out.println("Constructor with parametrs");

        this.employee_name = employee_name;
        this.employee_surname = employee_surname;
        this.employee_age = employee_age;
        this.employee_account_cash_balance = employee_account_cash_balance;
        this.employee_email = employee_email;
    }




    public void addToBalance(int addCash) {
        this.employee_account_cash_balance += addCash;
    }

    public void withdrawFromBalance(int takeCash) {
        if (this.employee_account_cash_balance - takeCash <= 0) {
            System.out.println("You don't have enough money, you account balance is: " + this.employee_account_cash_balance);
        } else {
            this.employee_account_cash_balance -= takeCash;
            System.out.println("You withdraw: " + takeCash + " you have " + this.employee_account_cash_balance + " on your account balance");
        }
    }


    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getEmployee_surname() {
        return employee_surname;
    }

    public void setEmployee_surname(String employee_surname) {
        this.employee_surname = employee_surname;
    }

    public int getEmployee_age() {
        return employee_age;
    }

    public void setEmployee_age(int employee_age) {
        this.employee_age = employee_age;
    }

    public int getEmployee_account_cash_balance() {
        return employee_account_cash_balance;
    }

    public void setEmployee_account_cash_balance(int employee_account_cash_balance) {
        this.employee_account_cash_balance = employee_account_cash_balance;
    }

    public String getEmployee_email() {
        return employee_email;
    }

    public void setEmployee_email(String employee_email) {
        this.employee_email = employee_email;
    }


}
