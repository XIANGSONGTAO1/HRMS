package com.tao.model;

import java.io.Serializable;

public class Resume implements Serializable {
    private int id;
    private String jobintention;
    private String skill;
    private String englishlevel;
    private String workexperience;
    private String selfevaluation;
    private String email;
    private Visitor visitor;

    public Resume() {
    }

    public Resume(int id, String jobintention, String skill, String englishlevel, String workexperience, String selfevaluation, String email, Visitor visitor) {
        this.id = id;
        this.jobintention = jobintention;
        this.skill = skill;
        this.englishlevel = englishlevel;
        this.workexperience = workexperience;
        this.selfevaluation = selfevaluation;
        this.email = email;
        this.visitor = visitor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getSelfevaluation() {
        return selfevaluation;
    }

    public void setSelfevaluation(String selfevaluation) {
        this.selfevaluation = selfevaluation;
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
                ", jobintention='" + jobintention + '\'' +
                ", skill='" + skill + '\'' +
                ", englishlevel='" + englishlevel + '\'' +
                ", workexperience='" + workexperience + '\'' +
                ", selfevaluation='" + selfevaluation + '\'' +
                ", email='" + email + '\'' +
                ", visitor=" + visitor +
                '}';
    }
}
