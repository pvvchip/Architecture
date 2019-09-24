package ru.pvv.architecture.observer;

public class Sensor extends Subject {
    private int t;

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
        notify(t);
    }
}
