package com.ualr.simpletasklist.model;

public class Task {

    // TODO 01. Define two attributes for the Task class: one to store the task description and a second one that
    //  indicates whether the task is done or not
    String _description = "";
    boolean _status = false;


    // TODO 02. Define the class constructor and the corresponding getters and setters.

    //default constructor
    public Task(){

    }

    //overloaded constructor
    public Task(String description, boolean status){
        _description = description;
        _status = status;
    }

    //Getters
    public String getTaskDescription(){
        return _description;
    }

    public boolean getTaskStatus(){
        return _status;
    }

    //Setters
    public void setDescription(String description){
        _description = description;
    }

    public void setStatus(boolean status){
        _status = status;
    }
}
