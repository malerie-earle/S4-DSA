package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class StackArrays {
    private int[] arr;
    private int topOfStack;
    private int size;

    // Constructor
    public StackArrays(int size) {
        this.size = size;
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The stack is created with a size of: " + size);
    }

    //Check if it is empty
    public boolean isEmpty(){
        if (topOfStack == -1){
            System.out.println("Stack is empty");
            return true;
        } else {
            System.out.println("Stack is not empty");
            return false;
        }
    }

    //Check if stack is Full
    public boolean isFull(){
        if (topOfStack == size -1){
            System.out.println("Stack is full");
            return true;
        } else {
            System.out.println("Stack is not full");
            return false;
        }
    }

    //Push method
    public void push(int value){
        if (isFull()) {
            System.out.println("Stack Overflow: Cannot push " + value + ", stack is full");
        } else {
            topOfStack++; // Increment topOfStack before inserting the new value
            arr[topOfStack] = value;
            System.out.println("Pushed " + value + " into the stack");
        }
    }

    //Pop method
    public void pop(){
        if (isEmpty()){
            System.out.println("The stack is empty");
        } else {
            int poppedValue = arr[topOfStack];
            topOfStack--;
            System.out.println("Popped " + poppedValue + " from the stack");
        }
    }

    //Peek method
    public int peek(){
        if (isEmpty()){
            System.out.println("Stack is empty, no element to peek");
            return -1; // Assuming -1 is used to indicate an error or empty stack
        } else {
            System.out.println("The value at the top of the stack is: " + arr[topOfStack - 1]);
            return arr[topOfStack - 1];
        }
    }

    //Delete the stack
    public void deleteStack(){
        arr = null;
        System.out.println("The stack is successfully deleted");
    }
}
