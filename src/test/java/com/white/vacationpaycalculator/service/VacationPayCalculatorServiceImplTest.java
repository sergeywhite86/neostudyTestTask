package com.white.vacationpaycalculator.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VacationPayCalculatorServiceImplTest {
 private VacationPayCalculatorService service;

 @BeforeEach
 public void init(){
     service = new VacationPayCalculatorServiceImpl();
 }
    @Test
    void calculate() {
        String expected = "70,00";
        String actual = service.calculate(293,7);
        assertEquals(expected,actual);
    }
}