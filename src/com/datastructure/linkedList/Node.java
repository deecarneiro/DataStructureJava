package com.datastructure.linkedList;

/**
 *
 * @author deecarneiro
 */
public class Node<T> {

    T data;
    Node next;

    // Constructor to create a new node
    // Next is by default initialized
    // as null
    Node(T d) {
        data = d;
    }
}
