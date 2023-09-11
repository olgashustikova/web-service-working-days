package webserviceworkingday.testwebserviceworkingday.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.LocalDate;

public class DayInfo {
    private int dayNumber;
    private LocalDate date;
    private boolean working;
    private String weekDay;
    private boolean isHoliday;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String holidayName;

    public DayInfo(int dayNumber, LocalDate date, boolean working, String weekDay, boolean isHoliday, String holidayName) {
        this.dayNumber = dayNumber;
        this.date = date;
        this.working = working;
        this.weekDay = weekDay;
        this.isHoliday = isHoliday;
        this.holidayName = holidayName;
    }



    public int getDayNumber() {
        return dayNumber;
    }

    public void setDayNumber(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }

    public String getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(String weekDay) {
        this.weekDay = weekDay;
    }
    public Boolean getIsHoliday() {
        return isHoliday;
    }
    public void setIsHoliday(Boolean isHoliday) {
        this.isHoliday = isHoliday;
    }
    public String getHolidayName() {
        return holidayName;
    }

    public void setHolidayName(String universalHolidayName) {
        this.holidayName = universalHolidayName;
    }
}
