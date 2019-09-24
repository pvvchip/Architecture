package ru.pvv.architecture.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Object arg) {
        observers.remove(arg);
    }

    protected void notify(Object arg) {
        for (Observer observer : observers
        ) {
            observer.update(this, arg);
        }
    }
}
