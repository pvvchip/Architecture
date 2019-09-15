package ru.pvv.architecture.adapter.object;

public class Start {
    public static void main(String[] args) {
        FlourInterface flourItemImplementor = new FlourItemImplementor();

        System.out.println(flourItemImplementor.get1kg().getPrice());
        System.out.println(flourItemImplementor.get1kg().getWeight());

        System.out.println(flourItemImplementor.get10kg().getPrice());
        System.out.println(flourItemImplementor.get10kg().getWeight());

        System.out.println(flourItemImplementor.getQuintal().getPrice());
        System.out.println(flourItemImplementor.getQuintal().getWeight());
    }
}
