package com.example;

public class NumberUtils {

    public static boolean numberContains3(int n) {
        n = Math.abs(n);
        while (n > 0) {
            if (n % 10 == 3) {
                return true;
            }
            n = n / 10;
        }
        return false;
    }
}
