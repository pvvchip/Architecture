package ru.pvv.architecture.adapter.object;

class FlourItem {
    Flour getFlourItem() {
        return new Flour(10, 1000);
    }
}
