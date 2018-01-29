package com.tao.model;

import java.io.Serializable;
import java.util.List;

public class Dept implements Serializable{
    private int id;
    private String name;
    private List<Position> positions;

    public Dept() {
    }

    public Dept(int id, String name,List<Position> positions) {
        this.id = id;
        this.name = name;
        this.positions=positions;
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

    public List<Position> getPositions() {
        return positions;
    }

    public void setPositions(List<Position> positions) {
        this.positions = positions;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", positions=" + positions +
                '}';
    }
}
