package Stacks;

public class StackLinkedLists {
    // Node class for linked list implementation
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top; // Top of the stack
    private int size; // Size of the stack

    // Constructor
    public StackLinkedLists() {
        this.top = null;
        this.size = 0;
        System.out.println("The stack is created");
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Push method to add an element to the stack
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        size++;
        System.out.println("Pushed " + value + " into the stack");
    }

    // Pop method to remove and return the top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty, cannot pop");
            return -1; // Return some default value indicating stack underflow
        } else {
            int poppedValue = top.data;
            top = top.next;
            size--;
            System.out.println("Popped " + poppedValue + " from the stack");
            return poppedValue;
        }
    }

    // Peek method to return the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty, no element to peek");
            return -1; // Return some default value indicating stack underflow
        } else {
            System.out.println("The value at the top of the stack is: " + top.data);
            return top.data;
        }
    }

    // Method to delete the stack
    public void deleteStack() {
        top = null;
        size = 0;
        System.out.println("The stack is successfully deleted");
    }

    // Method to get the size of the stack
    public int size() {
        return size;
    }
}