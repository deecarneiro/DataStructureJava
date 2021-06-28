package com.datastructure.linkedList;

import com.datastructure.base.StaticStructure;

/**
 *
 * @author deecarneiro
 */
public class LinkedList<T> extends StaticStructure<T> {

    static Node head;

    @Override
    protected boolean remove(int position) {
        return super.remove(position); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    protected boolean add(int position, Object element) throws Exception {
        this.increaseCapacity();
        Node newNode = new Node(element);
        for (int i = position; i > 0; i--) {
           
        }   
        
        return false;
    }

    @Override
    protected boolean add(T element) throws Exception {
        this.increaseCapacity();
        Node newNode = new Node(element);
        newNode.next = null;

        if (this.head == null) {
            this.head = newNode;
            this.size++;
        } else {
            Node last = this.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
            this.size++;
        }
        return false;
    }

    public static void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");

            currentNode = currentNode.next;
        }
        System.out.println("\n");
    }

    @Override
    public String toString() {
        StringBuilder tostring = new StringBuilder();
        Node currentNode = head;
        tostring.append("[");
        while (currentNode != null) {
            tostring.append(currentNode.data);
            tostring.append(", ");
            currentNode = currentNode.next;
        }
        tostring.append("]");

        return tostring.toString();
    }

    public static void main(String[] args) throws Exception {

        LinkedList<Integer> contacts = new LinkedList<>();

        contacts.add(1);
        contacts.add(3);
        contacts.add(2);

        System.out.print(contacts.size);
    }
}
