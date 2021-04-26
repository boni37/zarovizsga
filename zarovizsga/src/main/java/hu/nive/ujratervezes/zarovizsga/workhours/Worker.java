package hu.nive.ujratervezes.zarovizsga.workhours;

import java.time.LocalDate;
import java.util.Comparator;

public class Worker {

    private String name;
    private int workHour;
    private String date;

    public Worker(String name, int workHour, String date) {
        this.name = name;
        this.workHour = workHour;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public int getWorkHour() {
        return workHour;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return name + ": " + date;
    }
}
