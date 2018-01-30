package com.tao.model;

import java.io.Serializable;

public class Recruit implements Serializable{
    private int id;
    private String dept;
    private String position;
    private String desc1;
    private int status;

    public Recruit() {
    }

    public Recruit(int id, String dept, String position, String desc1, int status) {
        this.id = id;
        this.dept = dept;
        this.position = position;
        this.desc1 = desc1;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDesc1() {
        return desc1;
    }

    public void setDesc1(String desc1) {
        this.desc1 = desc1;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Recruit{" +
                "id=" + id +
                ", dept='" + dept + '\'' +
                ", position='" + position + '\'' +
                ", desc1='" + desc1 + '\'' +
                ", status=" + status +
                '}';
    }
}
