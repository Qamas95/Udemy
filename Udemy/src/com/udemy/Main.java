package com.udemy;


public class Main {
    public static void main(String[] args) {

/*        System.out.println("**************");
        Company test3 = new Company();

        System.out.println(test3.getEmployee_name());

        Company test2 = new Company("Qamas2","Kubiak2",24,4000,"@gmail.com");

        test2.withdrawFromBalance(200);
        System.out.println(test2.getEmployee_age());
        System.out.println(test2.getEmployee_account_cash_balance());
        System.out.println("**************");
        Company test = new Company();

        test.setEmployee_email("Qamas");
        test.setEmployee_surname("Kubiak");
        test.setEmployee_age(24);
        test.setEmployee_account_cash_balance(3000);
        test.setEmployee_email("wp@pl");

        test.addToBalance(400);
        test.withdrawFromBalance(3200);


        System.out.println("**************");
        Company test4 = new Company("Qamas3","Kubiak3","@op.pl");

        test4.withdrawFromBalance(5000);*/

        VipCustomer customer1 = new VipCustomer();
        System.out.println(customer1.getName());

        VipCustomer customer2 = new VipCustomer("Qamas", 25000.25);
        System.out.println(customer2.getName());

        VipCustomer customer3 = new VipCustomer("Bob",60000.00,"tim@gmail.com");

        System.out.println(customer3.getName());
        System.out.println(customer3.getEmail());

    }

}

