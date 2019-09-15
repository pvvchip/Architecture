package ru.pvv.architecture.adapter.сlass;


public class Start {
    public static void main(String[] args) {
        FlourInterface flourInterface = new FlourItemImplementor();

        System.out.println(flourInterface.get1kg().getPrice());
        System.out.println(flourInterface.get1kg().getWeight());
    }
}
