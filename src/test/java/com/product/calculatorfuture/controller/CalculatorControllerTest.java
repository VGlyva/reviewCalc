package com.product.calculatorfuture.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CalculatorControllerTest {
    @LocalServerPort
    private int port;

    @Autowired
    private CalculatorController calculatorController;
    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    void contextLoads() throws Exception {
        assertThat(calculatorController).isNotNull();
    }

    @Test
    void getCalculatorTest() throws Exception {
        assertThat(this.testRestTemplate.getForObject(
                "http://localhost:" + port + "/calculator", String.class)).isNotNull();
    }


}


