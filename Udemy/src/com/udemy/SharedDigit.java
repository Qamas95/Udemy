package com.udemy;

public class SharedDigit {

    public static boolean hasSharedDigit(int one, int two) {

        if ((one >= 10 && one <= 99) && (two >= 10 && two <= 99)) {

            if ((one == two) || ((one % 10) == (two % 10)) || ((one % 10) == (two / 10)) ||
                    ((two % 10) == (one % 10)) || ((two % 10) == (one / 10))
                    || ((two / 10) == (one / 10))) {
                return true;

            } else return false;

        } else return false;
    }
}
