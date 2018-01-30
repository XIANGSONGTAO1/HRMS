package com.tao.model;

import java.io.Serializable;

public class Resume implements Serializable {
    private int id;
    private String name;
    private String sex;
    private int age;
    private String school;
    private String major;
    private String natioin;
    private String tel;
    private String jobintention;
    private String skill;
    private String englishlevel;
    private String workexperience;
    private String selfevaluation;
    private String email;
    private Visitor visitor;

    public Resume() {
    }

    public Resume(int id, String name, String sex, int age, String educationlevel, String school, String major, String natioin, String tel, String jobintention, String skill, String englishlevel, String workexperience, String selfevaluation, String email, Visitor visitor) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.educationlevel = educationlevel;
        this.school = school;
        this.major = major;
        this.natioin = natioin;
        this.tel = tel;
        this.jobintention = jobintention;
        this.skill = skill;
        this.englishlevel = englishlevel;
        this.workexperience = workexperience;
        this.selfevaluation = selfevaluation;
        this.email = email;
        this.visitor = visitor;
    }


}
