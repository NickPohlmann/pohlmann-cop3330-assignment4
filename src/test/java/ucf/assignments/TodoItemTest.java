/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Nicholas Pohlmann
 */

package ucf.assignments;

import org.junit.jupiter.api.Test;

public class TodoItemTest {
    @Test
    void addTodoItem() {
        //Hit the create new item button and assign description, date, and isCompleted
        //Assert that the TodoItem saved is this
    }

    @Test
    void removeTodoItem() {
        //create a hand full of items within a single list and then delete a single list
        //Assert that the list now only contains the non-deleted item
    }

    @Test
    void displayAll() {
        //create around 7 items, some completed and some not
        //Assert that the display shows all the items
    }

    @Test
    void displayIncomplete() {
        //create around 7 items, some completed and some not
        //Assert that only the incomplete items are displayed
    }

    @Test
    void displayComplete() {
        //create around 7 items, some completed and some not
        //Assert that only the complete items are displayed
    }

    @Test
    void editItemDescription() {
        //create an item and assign a description, date, and isComplete
        //change the description
        //Assert that the description is now equal to the new description
    }

    @Test
    void editItemDate() {
        //create an item and assign a description, date, and isComplete
        //change the date
        //Assert that the date is now equal to the new date
    }

    @Test
    void changeIsCompleted() {
        //Create an item and assign description, date and isComplete
        //Change isComplete to the boolean it is not currently
        //Assert that the boolean changed (Test when starting with true and when with false)
    }
}
