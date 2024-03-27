package com.product.calculatorfuture.repositories;

import com.product.calculatorfuture.model.Calculator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalculatorRepository extends JpaRepository<Calculator, Long> {

}
