package webserviceworkingday.testwebserviceworkingday.entity;

import java.time.LocalDate;

public class DayInfo {
    private int dayNumber;
    private LocalDate date;
    private boolean working;
    private String weekDay;

    public DayInfo(int dayNumber, LocalDate date, boolean working, String weekDay) {
        this.dayNumber = dayNumber;
        this.date = date;
        this.working = working;
        this.weekDay = weekDay;
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
}
