package webserviceworkingday.testwebserviceworkingday.controller;


import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import webserviceworkingday.testwebserviceworkingday.entity.DayInfo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
public class WorkingDayController {
    @GetMapping("/working-days")
    public List<DayInfo> getWorkingDays(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate) {

        List<DayInfo> workingDays = new ArrayList<>();
        int dayNumber = 0;

        while (!startDate.isAfter(endDate)) {
            DayOfWeek dayOfWeek = startDate.getDayOfWeek();
            boolean working = dayOfWeek != DayOfWeek.SATURDAY && dayOfWeek != DayOfWeek.SUNDAY;

            workingDays.add(new DayInfo(++dayNumber, startDate, working, dayOfWeek.toString().substring(0, 3)));

            startDate = startDate.plusDays(1);
        }

        return workingDays;
    }
}

