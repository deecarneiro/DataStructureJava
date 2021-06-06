package com.datastructure.exec;

import com.datastructure.stack.Stack;

/**
 *
 * @author deecarneiro
 */
public class DecimalToBinary {

    public static void main(String[] args) throws Exception {

        printResult(2);

        printResult(4);

        printResult(10);

        printResult(25);

        printResult(100);

    }

    public static void printResult(int number) throws Exception {

        System.out.println(number + " in binary system is: " + decimalToBinary(number));
    }

    public static String decimalToBinary(int number) throws Exception {

        Stack<Integer> stack = new Stack<>();

        String numBinary = "";

        int remainder;

        while (number > 0) {
            remainder = number % 2;

            stack.push(remainder);

            number /= 2;

        }

        while (!stack.isEmpty()) {

            numBinary += stack.pop();
        }

        return numBinary;
    }
}
