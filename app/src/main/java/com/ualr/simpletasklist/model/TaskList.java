package com.ualr.simpletasklist.model;

import java.util.HashMap;
//import com.ualr.simpletasklist.model.Task;

public class TaskList {

    //DONE - TEST
    // TODO 03. Define TaskList's attributes. The class will have just one attribute to store all
    //  the tasks created by the user.

    HashMap<Integer, Task> _tasklist = new HashMap<Integer, Task>();

    // TIP. We need a data structure able to dynamically grow and shrink. That's why we'll use a HashMap.
    // where keys will be integer values and the mapped values will be a task object

    //DONE - TEST
    // TODO 04. Define the class constructor and the corresponding getters and setters.

    //default constructor
    public TaskList() {

    }

    public void setTasklist(HashMap<Integer, Task> tasklist) {
        _tasklist = tasklist;
    }

    public HashMap<Integer, Task> getTasklist() {
        return _tasklist;
    }

    //DONE - TEST
    // TODO 06.03. Define a new method called "add" that, given a task description, will create a
    //  new task and add it to the task list.

    public void add(String description) {
        Task temp = new Task(description, false);
        _tasklist.put((_tasklist.size() + 1), temp); //I'm not sure how to index the tasks
    }

    //DONE - TEST
    // TODO 06.04. Define a new "toString" method that provides a formatted string with all the tasks in the task list.
    // Format: 1 line per task. Each line should start with the id number of the task, then a dash, and the task description right after that.
    // If the task is marked as done, "Done" should be included at the end of the line

    public String toString() {
        String temp = "";
        String allTasks = "";

        for (int i : _tasklist.keySet()) {
            temp = i + "-" + (_tasklist.get(i).getTaskDescription()) + "-";
            if (_tasklist.get(i).getTaskStatus()) {
                temp = temp + "Done";
            } else {
                temp = temp + "Not Done";
            }
            allTasks = allTasks + temp + "\n";
            temp = "";
        }

        return allTasks;
    }

    //DONE - TEST
    // TODO 07.03. Define a new method called "delete" that, given a task id, will delete the
    //  corresponding task from the task list.

    public void delete(int taskID) {
        //Error handle ID outside the size of _tasklist
//        if (taskID >= _tasklist.size()) {
//            throw new IndexOutOfBoundsException("Error - No Task with Given ID");
//        } else if (_tasklist.get(taskID) == null) {
//            throw new IndexOutOfBoundsException("Error - No Task with Given ID");
//        } else {
//            _tasklist.remove(taskID);
//        }

        _tasklist.remove(taskID);
    }

    //DONE - TEST
    // TODO 08.03. Define a new method called "markDone" that, given a task id, will mark the
    //  corresponding task as done.

    public void markDone(int taskID) {
        //Error handle ID outside the size of _tasklist
//        if (taskID >= _tasklist.size()) {
//            throw new IndexOutOfBoundsException("Error - No Task with Given ID");
//        } else if (_tasklist.get(taskID) == null) {
//            throw new IndexOutOfBoundsException("Error - No Task with Given ID");
//        } else {
//            _tasklist.get(taskID).setStatus(true);
//        }

        _tasklist.get(taskID).setStatus(true);
    }

}
