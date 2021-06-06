/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datastructure.queue;

/**
 *
 * @author deecarneiro
 */
public class QueueDataStructure {

    public static void main(String[] args) throws Exception {
        
        Queue<Integer> queue = new Queue<>();
        
        queue.enqueue(4);
        queue.enqueue(2);
        queue.enqueue(3);
        
        int dequeued = queue.dequeue();
        
        System.out.println("Dequeued element is: "+dequeued);
        System.out.println("And the fist element is: "+ queue.peek());
    }
}
