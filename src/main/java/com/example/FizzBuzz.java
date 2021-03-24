package com.example;

public class FizzBuzz {

    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";
    public static final String FIZZBUZZ = "fizzbuzz";

    public static String solve(int n) {

        if (n % 3 == 0 && n % 5 == 0) {
            return FIZZBUZZ;
        }
        if (n % 3 == 0) {
            return FIZZ;
        }
        if (n % 5 == 0) {
            return BUZZ;
        }

        return String.valueOf(n);
    }

    public static String solveRange(int start, int finish) {
        StringBuilder sb = new StringBuilder();

        for (int i = start; i <= finish; i++) {
            sb.append(solve(i));

            if (i < finish) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }

}