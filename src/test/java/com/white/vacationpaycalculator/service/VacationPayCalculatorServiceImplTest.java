package com.white.vacationpaycalculator.service;

import com.white.vacationpaycalculator.repository.HolidaysRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class VacationPayCalculatorServiceImplTest {

 private VacationPayCalculatorService service;

 @BeforeEach
 public void init(){
     HolidaysRepo holidaysRepo = new HolidaysRepo();
     service = new VacationPayCalculatorService(holidaysRepo);
     service.setAvgDaysInMonth("29.4");
 }

    @Test
    void calculate() {
        BigDecimal expected = new BigDecimal("70.00");
        BigDecimal actual = service.calculate(BigDecimal.valueOf(294),7);
        assertEquals(expected,actual);
    }

    @Test
    void calculateWithDate() {
        BigDecimal expected = new BigDecimal("0.00");
        LocalDate noPayDate = LocalDate.of(2024,1,1);
        BigDecimal actual = service.calculateWithDateStartHoliday(BigDecimal.valueOf(294),8,noPayDate);
        assertEquals(expected,actual);
    }
}