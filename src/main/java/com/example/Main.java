package com.example;

public class Main {

    public static void main(String[] args) {

        try {
            int start = Integer.parseInt(args[0]);
            int end = Integer.parseInt(args[1]);

            System.out.println(FizzBuzz.solveRange(start, end));
        } catch (NumberFormatException nfe){
            System.out.println("please make sure that the input is in the following format: <start> <finish>");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}