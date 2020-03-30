package com.codewithmosh.observer.course.push;

import com.codewithmosh.observer.course.push.PushStyleSubject;

public class PushDataSource extends PushStyleSubject {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        notifyObservers(value);
    }

}
