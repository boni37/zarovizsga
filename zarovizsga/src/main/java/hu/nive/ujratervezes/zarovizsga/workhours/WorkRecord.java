package hu.nive.ujratervezes.zarovizsga.workhours;

import java.time.LocalDate;

public class WorkRecord implements Comparable<WorkRecord>{

    private String name;
    private int workhour;
    private LocalDate dateOfWork;

    public WorkRecord(String name, int workhour, LocalDate dateOfWork) {
        this.name = name;
        this.workhour = workhour;
        this.dateOfWork = dateOfWork;
    }

    public String getName() {
        return name;
    }

    public int getWorkhour() {
        return workhour;
    }

    public LocalDate getDateOfWork() {
        return dateOfWork;
    }

    @Override
    public int compareTo(WorkRecord o) {
        return this.workhour-o.workhour;
    }

    @Override
    public String toString() {
        return name + ": " + dateOfWork;
    }
}
