package com.white.vacationpaycalculator.service;

import org.springframework.stereotype.Service;

@Service
public class VacationPayCalculatorServiceImpl implements VacationPayCalculatorService {
    @Override
    public String calculate(double avgSalary, int countDays) {
        double avgDaysInMouth = 29.3;
        double salaryPerDay = avgSalary/avgDaysInMouth;
        double result = salaryPerDay * countDays;
        return String.format("%.2f",result);
    }
}
