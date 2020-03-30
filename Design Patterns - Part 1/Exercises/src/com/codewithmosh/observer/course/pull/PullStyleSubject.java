package com.codewithmosh.observer.course.pull;

import java.util.ArrayList;
import java.util.List;

public class PullStyleSubject {
    private List<PullObserver> observers = new ArrayList<>();
    public void registerObserver(PullObserver observer){
        observers.add(observer);
    }

    protected void notifyObservers() {
        for(PullObserver observer: observers) observer.updateState();
    }
}
