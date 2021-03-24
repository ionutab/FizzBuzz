package com.example;

import org.junit.jupiter.api.Test;

import static com.example.FizzBuzz.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void testIntegerOutput() {
        assertEquals("-1", FizzBuzz.solve(-1));
        assertEquals("1", FizzBuzz.solve(1));
        assertEquals("2", FizzBuzz.solve(2));
    }

    @Test
    void testFizzOutput() {
        assertEquals(FIZZ, FizzBuzz.solve(-3));
        assertEquals(FIZZ, FizzBuzz.solve(3));
        assertEquals(FIZZ, FizzBuzz.solve(99));
    }

    @Test
    void testBuzzOutput() {
        assertEquals(BUZZ, FizzBuzz.solve(-5));
        assertEquals(BUZZ, FizzBuzz.solve(5));
        assertEquals(BUZZ, FizzBuzz.solve(55));
    }

    @Test
    void testFizzBuzzOutput() {
        assertEquals(FIZZBUZZ, FizzBuzz.solve(-15));
        assertEquals(FIZZBUZZ, FizzBuzz.solve(0));
        assertEquals(FIZZBUZZ, FizzBuzz.solve(15));
        assertEquals(FIZZBUZZ, FizzBuzz.solve(45));
    }

    @Test
    void testFizzBuzzRange() {
        String nominalOutput = FizzBuzz.solveRange(1, 20);
        assertEquals("1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz", nominalOutput);
        String emptyOutput = FizzBuzz.solveRange(20, 19);
        assertEquals("", emptyOutput);
    }
}
