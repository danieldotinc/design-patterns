package com.codewithmosh.observer.course.push;

import com.codewithmosh.observer.course.push.PushObserver;

public class PushSpreadSheet implements PushObserver {
    private int value;
    @Override
    public void updateState(int value) {
        this.value = value;
        System.out.println("SpreadSheet Updated. New value: " + value);
    }
}
