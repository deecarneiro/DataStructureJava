package com.datastructure.exec;

import com.datastructure.stack.Stack;

/**
 *
 * @author deecarneiro
 */
public class HanoiTower {

    public static void main(String[] args) throws Exception {

        Stack<Integer> original = new Stack();
        Stack<Integer> destination = new Stack();
        Stack<Integer> aux = new Stack();

        original.push(3);
        original.push(2);
        original.push(1);

        hanoiTower(original.size(), original, destination, aux);
    }

    public static void hanoiTower(int n, Stack<Integer> original, Stack<Integer> destination, Stack<Integer> aux) throws Exception {

        if (n > 0) {
            hanoiTower(n - 1, original, aux, destination);
            destination.push(original.pop());
            System.out.println("----------------");
            System.out.println("Original:" + original);
            System.out.println("Destination:" + destination);
            System.out.println("Aux:"+aux);
            hanoiTower(n - 1, aux, destination, original);
        }
    }
}
