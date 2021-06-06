package com.datastructure.exec;

import com.datastructure.stack.Stack;

/**
 *
 * @author deecarneiro
 */
public class DecimalToAnySystem {

    public static void main(String[] args) throws Exception {

        printResult(25, 16);

        printResult(25, 2);

        printResult(10035, 8);

        printResult(10035, 16);

    }

    public static void printResult(int number, int base) throws Exception {

        System.out.println(number + " in "+base+" base system is: " + decimalToAnyBase(number, base));
    }

    public static String decimalToAnyBase(int number, int base) throws Exception {

        if (base > 16) {

            throw new IllegalArgumentException();
        }
        Stack<Integer> stack = new Stack<>();

        String numBase = "";

        int remainder;

        String bases = "0123456789ABCDEF";

        while (number > 0) {
            remainder = number % base;

            stack.push(remainder);

            number /= base;

        }

        while (!stack.isEmpty()) {
            numBase += bases.charAt(stack.pop());
        }

        return numBase;
    }
}
