package com.white.vacationpaycalculator.repository;


import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class HolidaysRepo {

    private final List<LocalDate> holidays;

    public int countPayDay(LocalDate date, int countDays) {
        int countPayDay = 0;
        for (int i = 0; i < countDays; i++) {
            if (!date.getDayOfWeek().name().equals("SUNDAY")
                    && !date.getDayOfWeek().name().equals("SATURDAY") && !holidays.contains(date)) {
                countPayDay++;
            }
            date = date.plusDays(1);
        }
        return countPayDay;
    }

    public HolidaysRepo() {
        holidays = new ArrayList<>();
        holidays.add(LocalDate.of(2024, 1, 1));
        holidays.add(LocalDate.of(2024, 1, 2));
        holidays.add(LocalDate.of(2024, 1, 3));
        holidays.add(LocalDate.of(2024, 1, 4));
        holidays.add(LocalDate.of(2024, 1, 5));
        holidays.add(LocalDate.of(2024, 1, 6));
        holidays.add(LocalDate.of(2024, 1, 7));
        holidays.add(LocalDate.of(2024, 1, 8));
        holidays.add(LocalDate.of(2024, 2, 23));
        holidays.add(LocalDate.of(2024, 2, 24));
        holidays.add(LocalDate.of(2024, 2, 25));
        holidays.add(LocalDate.of(2024, 3, 8));
        holidays.add(LocalDate.of(2024, 3, 9));
        holidays.add(LocalDate.of(2024, 3, 10));
        holidays.add(LocalDate.of(2024, 4, 28));
        holidays.add(LocalDate.of(2024, 4, 29));
        holidays.add(LocalDate.of(2024, 4, 30));
        holidays.add(LocalDate.of(2024, 5, 1));
        holidays.add(LocalDate.of(2024, 5, 9));
        holidays.add(LocalDate.of(2024, 5, 10));
        holidays.add(LocalDate.of(2024, 5, 11));
        holidays.add(LocalDate.of(2024, 5, 12));
        holidays.add(LocalDate.of(2024, 6, 12));
        holidays.add(LocalDate.of(2024, 11, 3));
        holidays.add(LocalDate.of(2024, 11, 4));
    }
}
