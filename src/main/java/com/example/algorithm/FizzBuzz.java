package com.example.algorithm;

import com.example.NumberUtils;

public class FizzBuzz {

    public static final String FIZZ     = "fizz";
    public static final String BUZZ     = "buzz";
    public static final String FIZZBUZZ = "fizzbuzz";
    public static final String ALFRESCO = "alfresco";

    public static String solve(int n) {

        if (NumberUtils.numberContains3(n)) {
            return ALFRESCO;
        }
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
        return solveRange(start, finish, null);
    }

    public static String solveRange(int start, int finish, FizzBuzzReport fizzBuzzReport) {
        StringBuilder sb = new StringBuilder();

        for (int i = start; i <= finish; i++) {
            String fizzBuzzItem = solve(i);
            sb.append(fizzBuzzItem);

            if (fizzBuzzReport != null) {
                fizzBuzzReport.countOccurrence(fizzBuzzItem);
            }

            if (i < finish) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }

}