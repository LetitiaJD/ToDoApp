package com.school.noteapp;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;

public class List implements Serializable, Cloneable {

    private String id;
    private String name;
    private String description;
    private String colour;
    private ArrayList<Task> taskList;

    public List() {

    }

    public List(String id, String name, String description, String colour) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.colour = colour;
        this.taskList = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean addTask(Task task) {
        if (this.taskList == null) {
    this.taskList = new ArrayList<>();
        }
        this.taskList.add(task);
        return true;
    }

    public boolean deleteTask(Task task) {
        for (Task t : this.taskList) {
            if (t.equals(task)) {
                this.taskList.remove(t);
                break;
            }
        }
        return true;
    }

    public ArrayList<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(ArrayList<Task> taskList) {
        this.taskList = taskList;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
