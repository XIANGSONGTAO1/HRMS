package com.tao.model;

import java.io.Serializable;

public class CheckOn implements Serializable {
    private int id;
    private String starttime;
    private String endtime;
    private int goworkstate;
    private int offwordstate;
    private Employee employee;

    public CheckOn() {
    }

    public CheckOn(int id, String starttime, String endtime, int goworkstate, int offwordstate, Employee employee) {
        this.id = id;
        this.starttime = starttime;
        this.endtime = endtime;
        this.goworkstate = goworkstate;
        this.offwordstate = offwordstate;
        this.employee = employee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public int getGoworkstate() {
        return goworkstate;
    }

    public void setGoworkstate(int goworkstate) {
        this.goworkstate = goworkstate;
    }

    public int getOffwordstate() {
        return offwordstate;
    }

    public void setOffwordstate(int offwordstate) {
        this.offwordstate = offwordstate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "CheckOn{" +
                "id=" + id +
                ", starttime='" + starttime + '\'' +
                ", endtime='" + endtime + '\'' +
                ", goworkstate=" + goworkstate +
                ", offwordstate=" + offwordstate +
                ", employee=" + employee +
                '}';
    }
}
