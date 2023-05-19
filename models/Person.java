package Furama.models;

import java.time.LocalDate;

public abstract class Person {
    private int id;

    private String name;

    private String birthday;

    private String gender;

    private long CMND;

    private int phone;

    private String email;

    public Person() {
    }

    public Person(int id, String name, String birthday, String gender, long CMND, int phone, String email) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.CMND = CMND;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public long getCMND() {
        return CMND;
    }

    public void setCMND(long CMND) {
        this.CMND = CMND;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", CMND=" + CMND +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }
}
