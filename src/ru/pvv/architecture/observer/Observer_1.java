package ru.pvv.architecture.observer;

public class Observer_1 implements Observer {
    @Override
    public void update(Subject subject, Object arg) {
        System.out.printf("%s Observer #1 %s\n", subject.toString(), arg);
    }
}
