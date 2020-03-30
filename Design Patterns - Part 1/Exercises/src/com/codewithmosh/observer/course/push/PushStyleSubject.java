package com.codewithmosh.observer.course.push;

import java.util.ArrayList;
import java.util.List;

public abstract class PushStyleSubject {
    private List<PushObserver> observers = new ArrayList<>();
    public void registerObserver(PushObserver observer){
        observers.add(observer);
    }

    protected void notifyObservers(int value) {
        for(PushObserver observer: observers) observer.updateState(value);
    }
}
