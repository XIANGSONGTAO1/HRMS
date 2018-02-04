package com.tao.model;

import java.io.Serializable;

public class Employee implements Serializable{
    private int id;
    private String username;
    private String password;
    private String truename;
    private double salary;
    private int age;
    private String sex;
    private int status;
    private Position position;
    private String email;
    private String tel;

    public Employee() {
    }

    public Employee(String tel,String email,Position position,int id, String username, String password, String truename, double salary, int age, String sex, int status) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.truename = truename;
        this.salary = salary;
        this.age = age;
        this.sex = sex;
        this.status = status;
        this.position=position;
        this.email=email;
        this.tel=tel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", truename='" + truename + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", status=" + status +
                ", position=" + position +
                ", email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
