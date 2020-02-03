package com.udemy;



public class Main {



    public static void main(String[] args) {


        ITelephone qamasPhone;
        qamasPhone = new DeskPhone(51234);
        qamasPhone.powerOn();
        qamasPhone.callPhone(51234);
        qamasPhone.answer();




        qamasPhone = new MobilePhone(432235);
        qamasPhone.powerOn();
        qamasPhone.callPhone(432235);
        qamasPhone.answer();




    }




}

