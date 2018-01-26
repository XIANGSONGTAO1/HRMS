package com.tao.model;

import java.io.Serializable;

public class Position implements Serializable {
    private int id;
    private String name;
    private Dept dept;
    private double salary;

    public Position() {
    }

    public Position(int id, String name, Dept dept, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
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

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Position{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept=" + dept +
                ", salary=" + salary +
                '}';
    }
}
