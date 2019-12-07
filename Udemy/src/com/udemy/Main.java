package com.udemy;


public class Main {
    public static void main(String[] args) {


        Company test3 = new Company();

        System.out.println(test3.getEmployee_name());

        Company test2 = new Company("Qamas2","Kubiak2",24,4000,"@gmail.com");

        test2.withdrawFromBalance(200);
        System.out.println(test2.getEmployee_age());
        System.out.println(test2.getEmployee_account_cash_balance());
        Company test = new Company();

        test.setEmployee_email("Qamas");
        test.setEmployee_surname("Kubiak");
        test.setEmployee_age(24);
        test.setEmployee_account_cash_balance(3000);
        test.setEmployee_email("wp@pl");

        test.addToBalance(400);
        test.withdrawFromBalance(3200);

    }

}


