package com.example.pd_project04_taskmanager;
import java.io.Serializable;

public class Task implements Serializable {

    private int id;
    private String name;
    private String date;

    public Task(int id, String name, String date) {
        this.id = id;
        this.name = name;
        this.date = date;
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

    public String getDate() {
        return date;
    }

    public void setD(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return id + " " + name + "\n" + date;
    }
}
