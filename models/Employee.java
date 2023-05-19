package Furama.models;

import java.time.LocalDate;

public class Employee extends Person {
    private String level;

    private String location;

    public Employee() {
    }

    public Employee(String level, String location) {
        this.level = level;
        this.location = location;
    }

    public Employee(int id, String name, String birthday, String gender, int CMND, int phone, String email, String level, String location) {
        super(id, name, birthday, gender, CMND, phone, email);
        this.level = level;
        this.location = location;
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

    @Override
    public String toString() {
        return "Employee{" +
                super.toString() +
                "level='" + level + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
