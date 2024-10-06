package com.white.vacationpaycalculator.service;

import com.white.vacationpaycalculator.repository.HolidaysRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;


@Service
@RequiredArgsConstructor
public class VacationPayCalculatorService {

    private final HolidaysRepo holidaysRepo;

    public BigDecimal calculate(BigDecimal avgSalary, int countDays) {
        BigDecimal avgDaysInMouth = new BigDecimal("29.4");
        BigDecimal salaryPerDay = avgSalary.divide(avgDaysInMouth, 2, RoundingMode.HALF_UP);
        return salaryPerDay.multiply(BigDecimal.valueOf(countDays));
    }

    public BigDecimal calculateWithDateStartHoliday(BigDecimal avgSalary, int countDays, LocalDate startHoliday) {
        int countPayDays = holidaysRepo.countPayDay(startHoliday,countDays);
        return calculate(avgSalary, countPayDays);
    }

}
