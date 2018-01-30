package com.tao.model;

import java.io.Serializable;

public class DeliverRecord implements Serializable{
    private int id;
    private Recruit recruit;
    private Resume resume;
    private Visitor visitor;
    private String dilivertime;
    private int status;
    private String interviewtime;
    private String interviewplace;
    private String worktime;

    public DeliverRecord() {
    }

    public DeliverRecord(int id, Recruit recruit, Resume resume, Visitor visitor, String dilivertime, int status, String interviewtime, String interviewplace, String worktime) {
        this.id = id;
        this.recruit = recruit;
        this.resume = resume;
        this.visitor = visitor;
        this.dilivertime = dilivertime;
        this.status = status;
        this.interviewtime = interviewtime;
        this.interviewplace = interviewplace;
        this.worktime = worktime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Recruit getRecruit() {
        return recruit;
    }

    public void setRecruit(Recruit recruit) {
        this.recruit = recruit;
    }

    public Resume getResume() {
        return resume;
    }

    public void setResume(Resume resume) {
        this.resume = resume;
    }

    public Visitor getVisitor() {
        return visitor;
    }

    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }

    public String getDilivertime() {
        return dilivertime;
    }

    public void setDilivertime(String dilivertime) {
        this.dilivertime = dilivertime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getInterviewtime() {
        return interviewtime;
    }

    public void setInterviewtime(String interviewtime) {
        this.interviewtime = interviewtime;
    }

    public String getInterviewplace() {
        return interviewplace;
    }

    public void setInterviewplace(String interviewplace) {
        this.interviewplace = interviewplace;
    }

    public String getWorktime() {
        return worktime;
    }

    public void setWorktime(String worktime) {
        this.worktime = worktime;
    }

    @Override
    public String toString() {
        return "DeliverRecord{" +
                "id=" + id +
                ", recruit=" + recruit +
                ", resume=" + resume +
                ", visitor=" + visitor +
                ", dilivertime='" + dilivertime + '\'' +
                ", status=" + status +
                ", interviewtime='" + interviewtime + '\'' +
                ", interviewplace='" + interviewplace + '\'' +
                ", worktime='" + worktime + '\'' +
                '}';
    }
}
