package com.datastructure.list;

import java.lang.reflect.Array;

/**
 *
 * @author deecarneiro
 */
public class List<T> {

    private T[] elements;
    private int size;

    public List(int capacity) {
        this.elements = (T[]) new Object[capacity];
        this.size = 0;

    }

    public List(int capacity, Class<T> classType) {
        this.elements = (T[]) Array.newInstance(classType, capacity);
        this.size = 0;

    }

    public boolean add(T element) throws Exception {
        this.increaseCapacity();
        if (this.size < this.elements.length) {
            this.elements[this.size] = element;
            this.size++;
            return true;
        }

        return false;
    }

    public boolean add(int position, T element) throws Exception {
        if (!(position >= 0 && position < size)) {
            throw new IllegalArgumentException("Invalid position");
        }

        this.increaseCapacity();

        for (int i = this.size - 1; i >= position; i--) {
            this.elements[i + 1] = this.elements[i];
        }
        this.elements[position] = element;
        this.size++;

        return false;

    }

    public boolean remove(int position) {
        if (!(position >= 0 && position < size)) {
            throw new IllegalArgumentException("Invalid position");
        }

        for (int i = position; i < this.size - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        this.size--;

        return false;
    }

    public void remove(T element) {
        int pos = this.find(element);

        if (pos > -1) {
            this.remove(pos);

        }
    }

    public T find(int position) {
        if (!(position >= 0 && position < size)) {
            throw new IllegalArgumentException("Invalid position");
        }
        return this.elements[position];
    }

    public int find(T element) {
        for (int i = 0; i < this.size; i++) {

            if (this.elements[i].equals(element)) {
                return i;
            }
        }

        return -1;
    }

    public boolean contains(T element) {

        int pos = find(element);

        if (pos > -1) {
            return true;
        }

        return false;
    }

    public int lastIndex(T element) {

        int lastPosition = -1;

        for (int i = this.size - 1; i >= 0; i--) {
            if (this.elements[i].equals(element)) {
                return i;
            }

        }
        return lastPosition;
    }

    public T get(int position) {

        return this.find(position);
    }

    public void clear() {

        this.elements = (T[]) new Object[this.elements.length];
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    private void increaseCapacity() {
        if (this.size == this.elements.length) {
            T[] elementsNew = (T[]) new Object[this.elements.length * 2];
            for (int i = 0; i < this.elements.length; i++) {
                elementsNew[i] = this.elements[i];
            }
            this.elements = elementsNew;
        }

    }

    @Override
    public String toString() {

        StringBuilder tostring = new StringBuilder();

        tostring.append("[");

        for (int i = 0; i < this.size - 1; i++) {
            tostring.append(this.elements[i]);
            tostring.append(", ");
        }

        if (this.size > 0) {
            tostring.append(this.elements[this.size - 1]);
        }

        tostring.append("]");

        return tostring.toString();
    }

}
