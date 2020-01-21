package com.company;


import java.util.ArrayList;


public class Main {


    public static void main(String[] args) {

        Bank bank = new Bank("PEKAO");

        if(bank.addBranch("Adelaide")){
            System.out.println("Adelaide branch created");
        }
        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide","Tim", 50);
        bank.addCustomer("Adelaide","Mike",175.34);
        bank.addCustomer("Adelaide", "Percy",20.20);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney","Bob",150.54);

        bank.addCustomerTransaction("Adelaide", "Tim",44.22);
        bank.addCustomerTransaction("Adelaide", "Tim",12.44);
        bank.addCustomerTransaction("Adelaide", "Mike",6.42);


        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Sydney",true);

        bank.addBranch("Melbourne");
        if(!bank.addCustomer("Melbourne","Brian",5.53)){
            System.out.println("Error Melbourne branch does not exist.");
        }

        if(!bank.addBranch("Adelaide")){
            System.out.println("Adelaide branch already exist");
        }

        if(!bank.addCustomerTransaction("Adelaide", "Fergus", 52.33)){
            System.out.println("Customer does not exist in branch");
        }

        if(!bank.addCustomer("Adelaide","Tim",12.21)){
            System.out.println("Customer Tim already exists");
        }


    }
}