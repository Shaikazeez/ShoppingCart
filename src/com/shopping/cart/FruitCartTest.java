package com.shopping.cart;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Azeez on 4/17/2016.
 */
public class FruitCartTest {
    FruitCart fruitCart;
    List<Fruit> fruitsList ;

    @Before
    public void setup(){
        fruitCart=new FruitCart();
        fruitsList=new ArrayList<>();
    }

    @Test
    public void test_Total_Fruit_Cost(){
        fruitsList.add(new Fruit(FruitName.APPLE,60));
        fruitsList.add(new Fruit(FruitName.APPLE,60));
        fruitsList.add(new Fruit(FruitName.APPLE,60));
        fruitsList.add(new Fruit(FruitName.APPLE,60));
        fruitsList.add(new Fruit(FruitName.ORANGE,25));
        fruitsList.add(new Fruit(FruitName.ORANGE,25));
        fruitsList.add(new Fruit(FruitName.ORANGE,25));
        fruitsList.add(new Fruit(FruitName.ORANGE,25));
        fruitCart.addFruits(fruitsList);
        double totalCost=fruitCart.getCost();
        assertEquals("1.95",Double.toString(totalCost) );
    }

    @Test
    public void test_Orange_Fruit_Cost(){
        fruitsList.add(new Fruit(FruitName.ORANGE,25));
        fruitsList.add(new Fruit(FruitName.ORANGE,25));
        fruitsList.add(new Fruit(FruitName.ORANGE,25));
        fruitsList.add(new Fruit(FruitName.ORANGE,25));
        fruitCart.addFruits(fruitsList);
        double totalCost=fruitCart.getCost();
        assertEquals("0.75",Double.toString(totalCost) );
    }

    @Test
    public void test_Apples_Cost(){
        fruitsList.add(new Fruit(FruitName.APPLE,60));
        fruitsList.add(new Fruit(FruitName.APPLE,60));
        fruitsList.add(new Fruit(FruitName.APPLE,60));
        fruitsList.add(new Fruit(FruitName.APPLE,60));
        fruitCart.addFruits(fruitsList);
        double totalCost=fruitCart.getCost();
        assertEquals("1.2",Double.toString(totalCost) );
    }

    @Test
    public void test_Total_Fruit_Cost_For_Empty_FruitList(){
        fruitCart.addFruits(fruitsList);
        double totalCost=fruitCart.getCost();
        assertEquals("0.0",Double.toString(totalCost) );
    }
}