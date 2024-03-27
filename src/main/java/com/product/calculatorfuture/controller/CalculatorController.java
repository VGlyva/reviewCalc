package com.product.calculatorfuture.controller;

import com.product.calculatorfuture.service.CalculatorServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
public class CalculatorController {
    private final CalculatorServiceImpl calculatorService;

    public CalculatorController(CalculatorServiceImpl calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/calculator")
    public ResponseEntity<String> helloCalc() {
        return ResponseEntity.ok(calculatorService.helloCalc());
    }

    @GetMapping("/sum")
    public ResponseEntity<Integer> sum(@RequestParam ArrayList<Integer> args) {
        return ResponseEntity.ok(calculatorService.saveSum(args));
    }

    @GetMapping("/multiply")
    public ResponseEntity<Integer> multiply(@RequestParam ArrayList<Integer> args) {
        return ResponseEntity.ok(calculatorService.saveMultiply(args));
    }

    @GetMapping("/multiplySum")
    public ResponseEntity<Integer> multiplySum(@RequestParam Integer numOne,
                                               @RequestParam Integer numTwo,
                                               @RequestParam Integer numThree) {
        return ResponseEntity.ok(calculatorService.saveSumMultiply(numOne, numTwo, numThree));
    }
    @GetMapping("minus")
    public ResponseEntity<Integer> minus(@RequestParam Integer numOne,
                                         @RequestParam Integer numTwo) {
        return ResponseEntity.ok(calculatorService.saveMinus(numOne,numTwo));
    }
}
