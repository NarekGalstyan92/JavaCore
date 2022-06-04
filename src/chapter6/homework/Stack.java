package chapter6.homework;

// This class defines an integer stack that can hold 10 values
public class Stack {
    int [] array = new int[10];
    int index;

    // Initialize top of stack
    Stack() {
        index = -1;
    }

    // Push an item onto the stack
    void push (int value) {
        if (index == 9) {
            System.out.println("Stack is full.");
        } else {
            array[++index] = value;
        }
    }
        //Pop an item from the stack
        int pop() {
            if (index < 0) {
                System.out.println("Stack underflow");
                return 0;
            } else {
                return  array[index--];
            }
    }
}
