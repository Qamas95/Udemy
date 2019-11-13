package com.udemy;

public class LastDigitChecker {



    public static boolean hasSameLastDigit(int one, int two, int three){
        if((one >= 10 && one <=1000) && (two >= 10 && two <=1000) && (three >= 10 && three <=1000)) {

            if((one%10 == two%10) || (one%10==three%10)){
                return true;
            } else if(((two%10 == one%10) || (two%10==three%10))){
                return true;
            }else if(((three%10 == one%10) || (three%10==two%10))){
                return true;
            } else return false;

        } else return false;
    }



    public static boolean isValid(int one){
        if(one >= 10 && one <=1000) {
            return true;
        } else return false;
    }

}
