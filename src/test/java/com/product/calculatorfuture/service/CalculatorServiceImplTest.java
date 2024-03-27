package com.product.calculatorfuture.service;

import com.product.calculatorfuture.controller.CalculatorController;
import com.product.calculatorfuture.model.Calculator;
import com.product.calculatorfuture.repositories.CalculatorRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@WebMvcTest(controllers = CalculatorController.class)
public class CalculatorServiceImplTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private CalculatorRepository calculatorRepository;
    @SpyBean
    private CalculatorService calculatorService;
    @InjectMocks
    private CalculatorController calculatorController;
    Integer NUM = 1;
    Integer NUM2 = 3;
    Integer NUM3 = 4;

    Calculator calculator = new Calculator(NUM, NUM2, NUM3);


    @Test
    void getSumTest() {
        ArrayList<Integer> mockList = new ArrayList<>();
        when(mockList.get(0)).thenReturn(1);
        when(mockList.get(1)).thenReturn(2);
        when(mockList.size()).thenReturn(2);

        int result = calculatorService.saveSum(mockList);
        assertEquals(3,result);
    }
}
