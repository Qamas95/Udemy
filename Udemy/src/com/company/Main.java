package com.company;




public class Main {


    public static void main(String[] args) {

        ITelephone qamasPhone;
        qamasPhone = new DeskPhone(1325123);
        qamasPhone.powerOn();
        qamasPhone.callPhone(5431321);
        qamasPhone.answer();

    }

}