// Node class representing each element in the stack
package stack;
// Stack class using LinkedList
public class StackLL {
    private class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
    private Node top; // Top of the stack

    // Push operation - adds element to the top
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top; // Link the new node to the previous top
        top = newNode;      // Update top
    }

    // Pop operation - removes and returns the top element
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int popped = top.data;
        top = top.next; // Move top to the next node
        return popped;
    }

    // Peek operation - returns the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    // isEmpty operation - checks if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Print operation - prints all elements in the stack
    public void print() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        Node current = top;
        System.out.print("Stack: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Main method to demonstrate operations
    public static void main(String[] args) {
        StackLL stack = new StackLL();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.print();               // Output: Stack: 30 20 10
        System.out.println(stack.pop());  // Output: 30
        stack.print();               // Output: Stack: 20 10
        System.out.println(stack.peek()); // Output: 20
        System.out.println(stack.isEmpty()); // Output: false
        stack.pop();
        stack.pop();
        stack.pop();                // Output: Stack Underflow
    }
}
