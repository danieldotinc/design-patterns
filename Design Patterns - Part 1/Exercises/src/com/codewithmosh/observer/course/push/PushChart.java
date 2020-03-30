package com.codewithmosh.observer.course.push;

import com.codewithmosh.observer.course.push.PushObserver;

public class PushChart implements PushObserver {
    private int value;
    @Override
    public void updateState(int value) {
        this.value = value;
        System.out.println("Chart Updated. New value: " + value);
    }
}
