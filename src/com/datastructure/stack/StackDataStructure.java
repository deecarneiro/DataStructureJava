package com.datastructure.stack;

/**
 *
 * @author deecarneiro
 */
public class StackDataStructure {

    public static void main(String[] args) throws Exception {

        Stack<Integer> stack = new Stack<Integer>();

        System.out.println(stack.isEmpty());

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();
        
        System.out.println(stack.isEmpty());

        System.out.println("Peek " + stack.peek());

    }

}
