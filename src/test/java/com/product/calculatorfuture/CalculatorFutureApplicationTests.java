package com.product.calculatorfuture;

import com.product.calculatorfuture.service.CalculatorServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorFutureApplicationTests {
	private final CalculatorServiceImpl calculatorService;

	CalculatorFutureApplicationTests(CalculatorServiceImpl calculatorService) {
		this.calculatorService = calculatorService;
	}

	@Test
	void contextLoads() {
	}

}
