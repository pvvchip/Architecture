package ru.pvv.architecture.observer;

public class Observer_2 implements Observer {

    @Override
    public void update(Subject subject, Object arg) {
        System.out.printf("%s Observer #2 %s\n", subject.toString(), arg);
    }

}
