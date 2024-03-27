package com.product.calculatorfuture.service;

import com.product.calculatorfuture.model.Calculator;
import com.product.calculatorfuture.repositories.CalculatorRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    private final CalculatorRepository calculatorRepository;

    public CalculatorServiceImpl(CalculatorRepository calculatorRepository) {
        this.calculatorRepository = calculatorRepository;
    }

    @Override
    public Integer saveSum(ArrayList<Integer> args) {
        Integer result = args.stream().reduce(0, Integer::sum);
        Calculator a = new Calculator(args, result, 0, 0, 0);
        a.setSum(result);
        calculatorRepository.save(a);
        return result;
    }

    @Override
    public Integer saveMultiply(ArrayList<Integer> args) {
        Integer result = args.stream().reduce(1, (a, b) -> a * b);
        Calculator a = new Calculator(args, 0, result, 0, 0);
        a.setMultiply(result);
        calculatorRepository.save(a);
        return result;
    }

    @Override
    public Integer saveSumMultiply(Integer numOne, Integer numTwo, Integer numThree) {
        return numOne * numTwo + numThree;
    }

    @Override
    public Integer saveMinus(Integer numOne, Integer numTwo) {
        return numOne - numTwo;
    }
}
