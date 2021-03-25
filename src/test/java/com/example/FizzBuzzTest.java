package com.example;

import org.junit.jupiter.api.Test;

import static com.example.FizzBuzz.FIZZ;
import static com.example.FizzBuzz.BUZZ;
import static com.example.FizzBuzz.FIZZBUZZ;
import static com.example.FizzBuzz.ALFRESCO;
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
        assertEquals(FIZZ, FizzBuzz.solve(-6));
        assertEquals(FIZZ, FizzBuzz.solve(6));
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
    void testAlfrescoOutput() {
        assertEquals(ALFRESCO, FizzBuzz.solve(-3));
        assertEquals(ALFRESCO, FizzBuzz.solve(13));
        assertEquals(ALFRESCO, FizzBuzz.solve(333));
        assertEquals(ALFRESCO, FizzBuzz.solve(2563));
    }

    @Test
    void testFizzBuzzRangeWithCorrectInput() {
        String nominalOutput = FizzBuzz.solveRange(1, 20);
        assertEquals("1 2 alfresco 4 buzz fizz 7 8 fizz buzz 11 fizz alfresco 14 fizzbuzz 16 17 fizz 19 buzz", nominalOutput);
    }

    @Test
    void testFizzBuzzRangeWithIncorrectInput() {
        String emptyOutput = FizzBuzz.solveRange(20, 19);
        assertEquals("", emptyOutput);
    }
}
