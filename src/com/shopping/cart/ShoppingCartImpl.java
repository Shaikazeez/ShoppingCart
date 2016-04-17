package com.shopping.cart;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Azeez on 4/17/2016.
 */
public class ShoppingCartImpl {
    public static void main(String args[]){
        FruitCart fruitCart=new FruitCart();
        List<Fruit> fruitsList=new ArrayList<>();
        fruitsList.add(new Fruit(FruitName.APPLE,60));
        fruitsList.add(new Fruit(FruitName.APPLE,60));
        fruitsList.add(new Fruit(FruitName.APPLE,60));
        fruitsList.add(new Fruit(FruitName.APPLE,60));
        fruitsList.add(new Fruit(FruitName.ORANGE,25));
        fruitsList.add(new Fruit(FruitName.ORANGE,25));
        fruitsList.add(new Fruit(FruitName.ORANGE,25));
        fruitsList.add(new Fruit(FruitName.ORANGE,25));
        fruitCart.addFruits(fruitsList);
        System.out.println("Total Cost of Fruits= £"+fruitCart.getCost());


    }
}
