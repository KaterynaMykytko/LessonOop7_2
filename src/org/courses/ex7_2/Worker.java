package org.courses.ex7_2;

import java.time.Year;

public class Worker {

    private String fio;
    private String position;
    private int employmentYear;

    public Worker(String fio, String position, int employmentYear) {
        this.fio = fio;
        this.position = position;
        this.employmentYear = employmentYear;
    }

    public String getFio() {
        return fio;
    }

    public String getPosition() {
        return position;
    }

    public int getEmploymentYear() {
        return employmentYear;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "fio='" + fio + '\'' +
                ", position='" + position + '\'' +
                ", employmentYear=" + employmentYear +
                '}';
    }

    public boolean isExperienceHigher(int experience){
        int exp = Year.now().getValue() - employmentYear;
        return exp > experience;
    }
}
