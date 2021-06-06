
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
    
    protected T peek(){
        if(this.isEmpty()){
            return null;
        }
        return this.elements[0];
    }
                    
    protected T dequeue(){
        
        if(this.isEmpty()){
            return null;
        }
        
        T element = this.elements[0];
        this.remove(0);
        return element;
    }   
}
