package main.entity;

import java.time.LocalDate;

public class Student {
    private Integer id;
    private String name;
    private LocalDate dob;
    private Integer mark;

    public Student() {
    }

    public Student(Integer id, String name, LocalDate dob, Integer mark) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.mark = mark;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
