package ru.pvv.architecture.adapter.сlass;

class Flour {
    private int weight;
    private float price;

    Flour(int weight, float price) {
        this.weight = weight;
        this.price = price;
    }

    int getWeight() {
        return weight;
    }

    void setWeight(int weight) {
        this.weight = weight;
    }

    float getPrice() {
        return price;
    }

    void setPrice(float price) {
        this.price = price;
    }
}
