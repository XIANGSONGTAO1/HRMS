package com.tao.model;

import java.io.Serializable;

public class Resume implements Serializable {
    private int id;
    private String name;
    private String sex;
    private int age;
    private String school;
    private String major;
    private String tel;
    private String jobintention;
    private String skill;
    private String englishlevel;
    private String workexperience;
    private String email;
    private Visitor visitor;

    public Resume() {
    }

    public Resume(int id, String name, String sex, int age, String educationlevel, String school, String major, String tel, String skill, String englishlevel, String workexperience, String email, Visitor visitor) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.school = school;
        this.major = major;
        this.tel = tel;
        this.jobintention = jobintention;
        this.skill = skill;
        this.englishlevel = englishlevel;
        this.workexperience = workexperience;
        this.email = email;
        this.visitor = visitor;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getJobintention() {
        return jobintention;
    }

    public void setJobintention(String jobintention) {
        this.jobintention = jobintention;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getEnglishlevel() {
        return englishlevel;
    }

    public void setEnglishlevel(String englishlevel) {
        this.englishlevel = englishlevel;
    }

    public String getWorkexperience() {
        return workexperience;
    }

    public void setWorkexperience(String workexperience) {
        this.workexperience = workexperience;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Visitor getVisitor() {
        return visitor;
    }

    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", school='" + school + '\'' +
                ", major='" + major + '\'' +
                ", tel='" + tel + '\'' +
                ", jobintention='" + jobintention + '\'' +
                ", skill='" + skill + '\'' +
                ", englishlevel='" + englishlevel + '\'' +
                ", workexperience='" + workexperience + '\'' +
                ", email='" + email + '\'' +
                ", visitor=" + visitor +
                '}';
    }
}
