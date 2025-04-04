package com.white.vacationpaycalculator.controller;

import com.white.vacationpaycalculator.service.VacationPayCalculatorService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDate;

@RestController
@RequiredArgsConstructor
public class VacationPayCalculatorController {

    private final VacationPayCalculatorService service;

    @Operation(summary = "Рассчитать отпускные",
            description = "Расчет отпускных")
    @GetMapping("/calculate")
    public BigDecimal calculate(@RequestParam BigDecimal avgSalary,
                                @RequestParam int countDays,
                                @RequestParam(required = false) LocalDate dateStartHolidays) {
        if (dateStartHolidays != null) {
            return service.calculateWithDateStartHoliday(avgSalary, countDays, dateStartHolidays);
        }
        return service.calculate(avgSalary, countDays);
    }
}
