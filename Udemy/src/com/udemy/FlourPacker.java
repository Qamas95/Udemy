package com.udemy;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        int a = bigCount * 5;
        int b = smallCount * 1;

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        } else if (goal > a + b) {
            return false;
        } else if (goal % 5 > smallCount) {
            return false;
        }






        /*    if ((a + b) == goal) {
                return true;
            } else if((a+b) > goal && ((a%goal==0))) {
                return true;
            } else if((a+b) > goal && goal-a > 0){
                return true;
            }
            return false;*/

return true;
    }
}




