package com.white.vacationpaycalculator.controller;

import com.white.vacationpaycalculator.service.VacationPayCalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VacationPayCalculatorController {
    private final VacationPayCalculatorService service;
    public VacationPayCalculatorController(VacationPayCalculatorService service) {
        this.service = service;
    }

    @GetMapping("/calculate")
    String calculate(@RequestParam double avgSalary,@RequestParam int countDays){
        return service.calculate(avgSalary,countDays);
    }
}
