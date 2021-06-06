package com.datastructure.stack;

import com.datastructure.base.StaticStructure;

/**
 *
 * @author deecarneiro
 */
public class Stack<T> extends StaticStructure<T> {

    public Stack(int capacity) {
        super(capacity);
    }

    public Stack(int capacity, Class<T> classType) {
        super(capacity, classType);
    }

    public Stack() {
        super();
    }

    public boolean push(T element) throws Exception {
        return super.add(element);
    }

    public boolean isEmpty() {
      return super.isEmpty();
    }

    protected T peek() {

        if (this.isEmpty()) {
            return null;
        }

        return this.elements[this.size - 1];

    }

    public T pop() {
        if (this.isEmpty()) {
            return null;
        }

        return  this.elements[--this.size];
    }

}
