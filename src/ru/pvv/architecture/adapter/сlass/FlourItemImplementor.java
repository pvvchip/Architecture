package ru.pvv.architecture.adapter.сlass;

public class FlourItemImplementor extends FlourItem implements FlourInterface {
    @Override
    public Flour getQuintal() {
        Flour f = getFlourItem();
        f.setPrice(f.getPrice() * 10);
        f.setWeight(100);
        return f;
    }

    @Override
    public Flour get10kg() {
        return getFlourItem();
    }

    @Override
    public Flour get1kg() {
        Flour f = getFlourItem();
        f.setPrice(f.getPrice() / 10);
        f.setWeight(1);
        return f;
    }

}
