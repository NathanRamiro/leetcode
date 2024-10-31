package com.nathanramiro.minStack;

import java.util.ArrayDeque;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum
 * element in constant time.
 * 
 * Implement the MinStack class:
 * 
 * MinStack() initializes the stack object.
 * void push(int val) pushes the element val onto the stack.
 * void pop() removes the element on the top of the stack.
 * int top() gets the top element of the stack.
 * int getMin() retrieves the minimum element in the stack.
 * 
 * You must implement a solution with O(1) time complexity for each function.
 * 
 * "using only some string, a squirrel and a megaphone"
 * 
 * technically deque methods have amortized O(1)
 */
public class MinStack {

    ArrayDeque<Integer> stack;
    ArrayDeque<Integer> minStack;

    public MinStack() {
        this.stack = new ArrayDeque<>();
        this.minStack = new ArrayDeque<>();
    }

    public void push(int val) {

        stack.addFirst(val);
        if (minStack.peekFirst() == null
                || minStack.peekFirst() >= val) {

            minStack.addFirst(val);
        }
    }

    public void pop() {
        if (stack.removeFirst().equals(minStack.peekFirst())) {
            minStack.removeFirst();
        }
    }

    public int top() {

        return stack.peekFirst();
    }

    public int getMin() {

        return minStack.peekFirst();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // return -3
        minStack.pop();
        System.out.println(minStack.top()); // return 0
        System.out.println(minStack.getMin()); // return -2

        minStack = new MinStack();

        minStack.push(512);
        minStack.push(-1024);
        minStack.push(-1024);
        minStack.push(512);
        minStack.pop();
        System.out.println(minStack.getMin()); // -1024
        minStack.pop();
        System.out.println(minStack.getMin()); // -1024
        minStack.pop();
        System.out.println(minStack.getMin()); // 512
    }
}
