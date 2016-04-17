package com.shopping.cart;

/**
 * Created by Azeez on 4/12/2016.
 */

enum FruitName{
    APPLE,ORANGE
}

public class Fruit {
    FruitName name;
    double price;

    public Fruit(FruitName name, double price) {
        this.name = name;
        this.price = price;
    }

    public FruitName getName() {
        return name;
    }

    public void setName(FruitName name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name=" + name +
                ", price=" + price +
                '}';
    }
}
