package com.example.service;

import com.example.algorithm.FizzBuzzReport;

public interface IFizzBuzzService {

    public String solveFizzBuzz(int start, int finish);

    public String solveFizzBuzz(int start, int finish, FizzBuzzReport fizzBuzzReport);

}
