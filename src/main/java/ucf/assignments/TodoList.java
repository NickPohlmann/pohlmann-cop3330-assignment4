/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Nicholas Pohlmann
 */

package ucf.assignments;


import javafx.fxml.FXML;

import javax.swing.*;

public class TodoList extends App{

    private String title;

    public TodoList (String title) {
        //This will set the title for the todo list
    }

    @FXML
    public void addNewItem (Action actionEvent) {
        //This will open and new window and prompt for a description and title and create the new item
    }

    @FXML
    public void removeItem (Action actionEvent) {
        //This button will allow the user to delete an item
    }

    @FXML
    public void displayAllItems (Action actionEvent) {
        //This will show all the items within a todoList
    }

    @FXML
    public void displayCompletedItems (Action actionEvent) {
        //This will show all the completed items by using the isCompleted Boolean to
    }

    @FXML
    public void displayIncompleteItems (Action actionEvent) {
        //This will show all the incomplete items by displaying all isCompleted == false
    }
}



