package com.example.adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumeration<T> implements Enumeration<T> {
    private final Iterator<T> it;

    public IteratorEnumeration(Iterator<T> it){
        this.it=it;
    }

    @Override
    public boolean hasMoreElements() {
        return this.it.hasNext();
    }

    @Override
    public T nextElement() {
        return this.it.next();
    }
}
