package com.tao.model;

public class Recruit {
    private int id;
    private Dept dept;
    private Position position;
    private String desc;
    private double salary;

    public Recruit() {
    }

    public Recruit(int id, Dept dept, Position position, String desc, double salary) {
        this.id = id;
        this.dept = dept;
        this.position = position;
        this.desc = desc;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Recruit{" +
                "id=" + id +
                ", dept=" + dept +
                ", position=" + position +
                ", desc='" + desc + '\'' +
                ", salary=" + salary +
                '}';
    }
}
