package com.product.calculatorfuture.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface CalculatorService {
    String helloCalc();
    Integer saveSum(ArrayList<Integer> args);
    Integer saveMultiply(ArrayList<Integer> args);
    Integer saveSumMultiply(Integer numOne, Integer numTwo, Integer numThree);
    Integer saveMinus(Integer numOne, Integer numTwo);
}
