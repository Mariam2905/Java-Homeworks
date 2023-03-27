package org.example.homeworks.collections.list.stack;

import java.util.ArrayList;

public class Stack<T> {

    /*21.Write a generic class Stack<T> that can be used to represent stacks of objects of type T.
    The class should include methods push(), pop(), and isEmpty().
    Inside the class, use an ArrayList to hold the items on the stack.*/

    private ArrayList<T> stack;

    public Stack() {
        this.stack = new ArrayList<T>();
    }

    public ArrayList<T> getStack() {
        return stack;
    }

    /**
     * This method adds an element in ArrayList;
     *
     * @param item type T;
     */
    void push(T item) {
        this.stack.add(item);
    }

    /**
     * This method removes an element in ArrayList;
     *
     * @return
     */
    T pop() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return this.stack.remove(this.stack.size() - 1);
    }

    /**
     * This method clears ArrayList;
     *
     * @return empty ArrayList;
     */
    boolean isEmpty() {
        return this.stack.isEmpty();
    }
}
