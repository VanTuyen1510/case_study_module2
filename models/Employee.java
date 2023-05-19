package Furama.models;

import java.time.LocalDate;

public class Employee extends Person {
    private String level;

    private String location;

    private long wage;

    public Employee() {
    }

    public Employee(String level, String location, long wage) {
        this.level = level;
        this.location = location;
        this.wage = wage;
    }

    public Employee(int id, String name, String birthday, String gender, long CMND, int phone, String email, String level, String location, long wage) {
        super(id, name, birthday, gender, CMND, phone, email);
        this.level = level;
        this.location = location;
        this.wage = wage;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getWage() {
        return wage;
    }

    public void setWage(long wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString() +
                "level='" + level + '\'' +
                ", location='" + location + '\'' +
                ", wage=" + wage +
                '}';
    }
}
