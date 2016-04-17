package com.shopping.cart;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Azeez on 4/17/2016.
 */
public class FruitCart {
    private List<Fruit> fruitList;

    public FruitCart(){
        fruitList=new ArrayList<>();
    }
    public FruitCart(List<Fruit> fruitList) {
        this.fruitList = fruitList;
    }
    public void addFruits(List<Fruit> fruits){
        fruits.stream().forEach(fruit -> fruitList.add(fruit));
    }
    public  double getCost(){
        double totalCost=0;
        boolean appleOffer=false;
        int orangeOffer=0;
        for(Fruit fruit:fruitList){
            FruitName f=fruit.getName();
            switch(f){
                case APPLE:
                    if(!appleOffer){
                        totalCost=totalCost+fruit.getPrice();
                        appleOffer=true;
                    }else{
                        appleOffer=false;
                    }
                    break;
                case ORANGE:
                    if(orangeOffer == 2){
                        orangeOffer=0;
                    }else{
                        orangeOffer++;
                        totalCost=totalCost+fruit.getPrice();
                    }
                    break;
                default:
                    System.out.println("Invalid Fruit");

            }
        }
        return totalCost>0.0? totalCost/100: totalCost;

    }

}
