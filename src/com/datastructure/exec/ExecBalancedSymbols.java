package com.datastructure.exec;

import com.datastructure.stack.Stack;

/**
 *
 * @author deecarneiro
 */
public class ExecBalancedSymbols {

    public static void main(String[] args) throws Exception {
        
        String expression = "[(A+B) + C+B]";

        boolean isBalanced = isBalanced(expression);

        System.out.println("Is "+isBalanced+"a balanced expression? " + isBalanced);
    }

    final static String BEGIN = "([{";
    final static String END = ")]}";

    public static boolean isBalanced(String expression) throws Exception {
        boolean isBalanced = true;

        Stack<Character> stack = new Stack<>();

        char symbol, peek;

        for (int i = 0; i < expression.length(); i++) {
            symbol = expression.charAt(i);

            if (BEGIN.indexOf(symbol) > -1) {
                stack.push(symbol);

            } else if (END.indexOf(symbol) > -1) {

                if (stack.isEmpty()) {
                    return false;

                } else {
                    peek = stack.pop();

                    if (BEGIN.indexOf(peek) != END.indexOf(symbol)) {
                        return false;
                    }

                }
            }
        }

        return true;
    }
}
