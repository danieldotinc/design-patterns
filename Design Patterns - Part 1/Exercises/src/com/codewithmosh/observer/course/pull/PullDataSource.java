package com.codewithmosh.observer.course.pull;

import com.codewithmosh.observer.course.push.PushStyleSubject;

public class PullDataSource extends PullStyleSubject {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        notifyObservers();
    }

}
