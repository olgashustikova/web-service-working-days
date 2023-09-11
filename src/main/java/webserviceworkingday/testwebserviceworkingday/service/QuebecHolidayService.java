package webserviceworkingday.testwebserviceworkingday.service;

import java.time.LocalDate;
import java.time.MonthDay;
import java.util.HashMap;
import java.util.Map;

public class QuebecHolidayService {
    private static Map<MonthDay, String> quebecHolidays= new HashMap<>();

    static {
        // Define fixed-date holidays
        quebecHolidays.put((MonthDay.of(1, 1)), "New Year's Day");
        quebecHolidays.put((MonthDay.of(7, 1)), "Canada Day");
        quebecHolidays.put((MonthDay.of(12, 25)), "Christmas Day");
        // Add other holidays and rules here
    }

    public static String getHolidayName(LocalDate date) {
        MonthDay monthDay = MonthDay.from(date);
        return quebecHolidays.get(monthDay);
    }

    public static boolean isQuebecHoliday(LocalDate date) {
        MonthDay monthDay = MonthDay.from(date);
        return quebecHolidays.containsKey(monthDay);
    }
}
