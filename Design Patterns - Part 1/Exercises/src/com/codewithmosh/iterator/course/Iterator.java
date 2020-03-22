package com.codewithmosh.iterator.course;

public interface Iterator<T> {
    boolean hasNext();
    T getCurrent();
    void next();
}
