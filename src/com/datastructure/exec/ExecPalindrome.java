package com.datastructure.exec;

import com.datastructure.stack.Stack;

/**
 *
 * @author deecarneiro
 */
public class ExecPalindrome {

    public static void main(String[] args) throws Exception {

        String word = "Ata";
        boolean isPalindrome = palindromeTest(word);

        System.out.println(word + " is a palindrome? " + isPalindrome);

    }

    public static boolean palindromeTest(String word) throws Exception {

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        String inverseWord = "";

        while (!stack.isEmpty()) {

            inverseWord += stack.pop();
        }

        if (word.equalsIgnoreCase(inverseWord)) {
            return true;
        }
        return false;
    }
}
