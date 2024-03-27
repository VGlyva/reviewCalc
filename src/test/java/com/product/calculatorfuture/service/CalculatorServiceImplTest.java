package com.product.calculatorfuture.service;
import com.product.calculatorfuture.repositories.CalculatorRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;



@ExtendWith(MockitoExtension.class)
public class CalculatorServiceImplTest {
    @Mock
    private CalculatorRepository calculatorRepository;
    @InjectMocks
    private CalculatorServiceImpl out;
    int ONE = 1;
    int TWO = 2;
    int THREE = 3;

    public void createList() {

    }
    @Test
    void getSumTest() {
        ArrayList<Integer> testList = new ArrayList<>();
        testList.add(9);
        testList.add(2);

        int result = out.saveSum(testList);
        assertEquals(11, result);
    }
    @Test
    void getMultiply() {
        ArrayList<Integer> testList = new ArrayList<>();
        testList.add(9);
        testList.add(2);

        int result = out.saveMultiply(testList);
        assertEquals(18,result);
    }
    @Test
    void getSumMultiply() {
        int result = out.saveSumMultiply(ONE,TWO,THREE);
        assertEquals(5,result);
    }
    @Test
    void getMinus() {
        int result = out.saveMinus(TWO,ONE);
        assertEquals(1,result);
    }

}
