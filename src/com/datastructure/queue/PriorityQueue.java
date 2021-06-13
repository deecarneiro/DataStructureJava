
package com.datastructure.queue;

/**
 *
 * @author deecarneiro
 */
public class PriorityQueue<T> extends Queue<T> {

    public PriorityQueue() {
    }

    public PriorityQueue(int capacity) {
        super(capacity);
    }

    public PriorityQueue(int capacity, Class<T> classType) {
        super(capacity, classType);
    }

    protected void enqueue(T element) throws Exception {

        Comparable<T> key = (Comparable<T>) element;

        int i;
        for (i = 0; i < this.size; i++) {
            if (key.compareTo(this.elements[i]) < 0) {
                break;
            }
        }
        this.add(i, element);
    }

}
