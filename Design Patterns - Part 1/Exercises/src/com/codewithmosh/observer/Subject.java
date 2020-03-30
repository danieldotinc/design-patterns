package com.codewithmosh.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void registerObserver(Observer observer){
        observers.add(observer);
    }
    public void unregisterObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(Stock stock){
        for (Observer observer: observers)
            observer.update(stock);
    }
}
