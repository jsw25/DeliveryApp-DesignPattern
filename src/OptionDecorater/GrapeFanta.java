package OptionDecorater;

import OrderMenuComponent.OrderBurgerMenuComponent;

public class GrapeFanta extends Fanta {
    private static final int cost = 1000;// 정하는 것임!

    public GrapeFanta(OrderBurgerMenuComponent orderBurgerMenuComponent){
        this.orderBurgerMenuComponent = orderBurgerMenuComponent;
        totalCost+=cost;
    }

    @Override
    public void prepareBurgerIngredient() {
        // 무엇을 넣어야할까?
        ..
    }

    public int getCost(){return cost;}
}
