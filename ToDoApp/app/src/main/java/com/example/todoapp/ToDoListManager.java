package com.example.todoapp;

import java.util.ArrayList;
import java.util.List;

public class ToDoListManager {

    private List<ToDoItem> items;

    public ToDoListManager(){
        items = new ArrayList<ToDoItem>();

        items.add(new ToDoItem("Get Milk", false));
        items.add(new ToDoItem("Walk the dog", true));
        items.add(new ToDoItem("Go to gym", false));
    }

    public List<ToDoItem> getItems() {
        return items;
    }

    public void addItem(ToDoItem item) { items.add(item); }

    public void deleteItem(ToDoItem item) { items.remove(item); }
}
