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

    protected Node deleteAtPosition(int index) {
        Node currNode = head, prev = null;

        if (index == 0 && currNode != null) {
            head = currNode.next;
            return head;
        }

        int counter = 0;

        while (currNode != null) {

            if (counter == index) {
                prev.next = currNode.next;
                break;
            } else {
                prev = currNode;
                currNode = currNode.next;
                counter++;
            }
        }

        if (currNode == null) {
            throw new IllegalArgumentException("Cannot delete at invalid position");
        }
        return head;
    }

    public Node insertAtPosition(T element, int index) {

        Node newNode = new Node(element);
        
        if (index < 0) {
            throw new IllegalArgumentException("Cannot insert at invalid positon");
        } 
        
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node prev = head;
            for (int i = 1; i < index; i++) {
                if (prev != null) {
                    prev = prev.next;
                }
            }

            if (prev != null) {
                newNode.next = prev.next;
                prev.next = newNode;
            } else {
                System.out.print("\nThe previous node is null.");
            }
        }
        return head;
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
            String comma = (currentNode.next != null) ? ", " : "";
            tostring.append(currentNode.data + comma);
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
        contacts.deleteAtPosition(2);
        System.out.println(contacts);
        contacts.insertAtPosition(8, 2);
        System.out.println(contacts);

    }
}
