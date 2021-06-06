/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datastructure.list;

import com.datastructure.base.StaticStructure;

/**
 *
 * @author deecarneiro
 * @param <T>
 */
public class ListStatic<T> extends StaticStructure<T> {

    public ListStatic(int capacity) {
        super(capacity);
    }

    public ListStatic(int capacity, Class<T> classType) {
        super(capacity, classType);
    }

    @Override
    public boolean add(int position, T element) throws Exception {
        return super.add(position, element);
    }

    @Override
    public boolean add(T element) throws Exception {
        return super.add(element); 
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public int size() {
        return super.size(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(int position) {
        return super.remove(position); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
