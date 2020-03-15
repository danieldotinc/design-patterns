package com.bacc.designpatterns.iterator;

public interface Iterator<T> {
    boolean hasNext();
    T getCurrent();
    void next();
}
