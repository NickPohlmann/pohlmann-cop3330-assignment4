/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Nicholas Pohlmann
 */

package ucf.assignments;

import javafx.fxml.FXML;

import javax.swing.*;
import java.util.Date;

public class TodoItem extends TodoList{

    private String description;
    private Date dueDate;
    private boolean isCompleted;

    public TodoItem (String description, Date dueDate, boolean isCompleted) {
        //This will be the initial setter for the todoItem
    }

    @FXML
    public void changeDescriptionButtonClicked (Action actionEvent) {
        //This will open a new window, that prompts the user to enter the new description
        // and then this will reassign the value of the description
    }

    @FXML
    public void changeDueDateButtonClicked (Action actionEvent) {
        //This will open a new window, that prompts the user to enter the new date
        // and then this will reassign the value of the date
    }

    @FXML
    public void changeIsCompleted (Action actionEvent) {
        //This will be a button or slider that will change the boolean isCompleted
        //from true to false and false to true depending on if the item is complete
    }
}
