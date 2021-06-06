
package com.datastructure.queue;

import com.datastructure.base.StaticStructure;

/**
 *
 * @author deecarneiro
 */
public class Queue<T> extends  StaticStructure<T>{

    public Queue() {
        this(10);
    }

    public Queue(int capacity) {
        super(capacity);
    }

    public Queue(int capacity, Class<T> classType) {
        super(capacity, classType);
    }
    
    protected void enqueue(T element) throws Exception{
        super.add(element);
    }
    
    protected void spy(){}
                    
    protected T dequeue(){
        T element = this.elements[0];
        for(int i = 0; i < this.size; i++){
            this.elements[i] = this.elements[i+1];
        }
        this.size--;
        return element;
    }   
}
