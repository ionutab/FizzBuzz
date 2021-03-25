package com.example.service;

import com.example.algorithm.FizzBuzz;
import com.example.algorithm.FizzBuzzReport;
import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService implements IFizzBuzzService {

    public String solveFizzBuzz(int start, int finish) {
        return FizzBuzz.solveRange(start, finish);
    }

    public String solveFizzBuzz(int start, int finish, FizzBuzzReport fizzBuzzReport) {
        return FizzBuzz.solveRange(start, finish);
    }

}
