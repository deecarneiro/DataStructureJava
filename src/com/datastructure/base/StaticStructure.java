package com.datastructure.base;

import java.lang.reflect.Array;

public class StaticStructure<T> {

    protected T[] elements;
    protected int size;

    protected StaticStructure() {
        this(10);

    }

    protected StaticStructure(int capacity) {
        this.elements = (T[]) new Object[capacity];
        this.size = 0;

    }

    protected StaticStructure(int capacity, Class<T> classType) {
        this.elements = (T[]) Array.newInstance(classType, capacity);
        this.size = 0;

    }

    protected boolean add(T element) throws Exception {
        this.increaseCapacity();
        if (this.size < this.elements.length) {
            this.elements[this.size] = element;
            this.size++;
            return true;
        }

        return false;
    }

    protected boolean add(int position, T element) throws Exception {
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

    protected boolean remove(int position) {
        if (!(position >= 0 && position < size)) {
            throw new IllegalArgumentException("Invalid position");
        }

        for (int i = position; i < this.size - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        this.size--;

        return false;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    protected void increaseCapacity() {
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
