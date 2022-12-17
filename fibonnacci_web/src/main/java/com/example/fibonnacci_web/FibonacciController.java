package com.example.fibonnacci_web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@RequestMapping("/app")
public class FibonacciController {

    private static final String NAME = "Mateusz Markowski";
    private static final String GROUP = "2.3";
    private static final String PROGRAM_NAME = "Aplikacja do wyliczania kolejnej liczby w ciągu fibonacciego";

    private final FibonacciService fibonacciService;

    public FibonacciController(final FibonacciService fibonacciService) {
        this.fibonacciService = fibonacciService;
    }

    @GetMapping("/generate")
    public String getFibbonacciNumber(final int number){
        final BigInteger result = fibonacciService.fastFibonacciMatrix(number);
        return "Wynik: "+result +" "+ NAME + " " + GROUP + " " + PROGRAM_NAME;
    }
}
