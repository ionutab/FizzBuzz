package com.example.controller;

import com.example.service.IFizzBuzzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FizzBuzzController {

    IFizzBuzzService fizzBuzzService;

    @Autowired
    public void setFizzBuzzService(IFizzBuzzService fizzBuzzService) {
        this.fizzBuzzService = fizzBuzzService;
    }

    @GetMapping("/fizzBuzz")
    @ResponseBody
    public String index(@RequestParam Integer start, @RequestParam Integer finish) {
        return fizzBuzzService.solveFizzBuzz(start, finish);
    }
}
