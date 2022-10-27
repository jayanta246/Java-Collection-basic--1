package org.jayanta.dataStructure;

import java.net.SocketOption;
import java.util.Stack;

public class StackDataStructure {
    public static void main (String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(5);
        stack.push(9);

        System.out.println("printing element of the stack");
        System.out.println(stack);
        System.out.println("top element of the stack " + stack.peek());
    }
}

/*
Stack is LIFO
 */