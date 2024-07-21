package Stacks;

public class StackMain {
    public static void main(String[] args) {
        // Create an instance of StackArrays with size 5
        System.out.println("StackArrays:");
        StackArrays stackArrays = new StackArrays(5);
        System.out.println();

        // Push elements onto the stack
        System.out.println("Pushing elements:");
        stackArrays.push(1);
        stackArrays.push(2);
        stackArrays.push(3);
        System.out.println();

        // Check if the stack is empty or full
        System.out.println("Stack Empty or Full?:");
        System.out.println("Is stack empty? " + stackArrays.isEmpty());
        System.out.println("Is stack full? " + stackArrays.isFull());
        System.out.println();

        // Peek at the top element of the stack
        System.out.println("Peek:");
        System.out.println("Peek: " + stackArrays.peek());
        System.out.println();

        // Pop elements from the stack
        System.out.println("Popping elements:");
        while (!stackArrays.isEmpty()) {
            stackArrays.pop();
        }

        // After popping all elements, the stack should be empty
        System.out.println("Is stack empty now? " + stackArrays.isEmpty());
        System.out.println();
        System.out.println();

        // Create an instance of StackLinkedList
        System.out.println("StackLinkedList:");
        StackLinkedLists stackLinkedList = new StackLinkedLists();
        System.out.println();

        // Push elements onto the stack
        System.out.println("Pushing elements:");
        stackLinkedList.push(1);
        stackLinkedList.push(2);
        stackLinkedList.push(3);

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stackLinkedList.isEmpty());
        System.out.println();

        // Peek at the top element of the stack
        System.out.println("Peek:");
        System.out.println("Peek: " + stackLinkedList.peek());
        System.out.println();

        // Pop elements from the stack
        System.out.println("Popping elements:");
        while (!stackLinkedList.isEmpty()) {
            stackLinkedList.pop();
        }

        // After popping all elements, the stack should be empty
        System.out.println("Is stack empty now? " + stackLinkedList.isEmpty());
        System.out.println();

        // Delete the stack (if needed)
        System.out.println("Deleting the stack:");
        stackLinkedList.deleteStack();
    }
}
