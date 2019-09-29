package ru.pvv.architecture.value_object;

public class Start {
    public static void main(String[] args) {
        MyDate start = new MyDate(15, 6, 2000);
        System.out.println(start + "- Start");

        System.out.println(start.add(new MyDate(5, 6, 2000)));
        System.out.println(start.add(new MyDate(16, 6, 2000)));

        System.out.println(start + "- Start");
    }
}
