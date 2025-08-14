package com.oracle.session05.ex1;

public class StackIArraympl implements Stack{
    private int[] x;
    private final int SIZE;
    private int top;

    public StackIArraympl(int size) {
        this.SIZE = size;
        this.x = new int[SIZE]; // Allocate memory for array
        this.top = -1;          // Stack is empty initially
    }

    public void push(int element) {
        if (top >= SIZE - 1) {
            System.out.println("Stack Overflow! Cannot push " + element);
        } else {
            x[++top] = element; // Increment top first, then insert
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
            return -99; // Error value
        } else {
            return x[top--]; // Return element, then decrement top
        }
    }
}
