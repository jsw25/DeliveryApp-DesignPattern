package OptionDecorater;

import OrderMenuComponent.OrderBurgerMenuComponent;

public class OriginalPotatoes extends FrenchFries{
    private static final int cost = 1200;// 정하는 것임!

    public OriginalPotatoes(OrderBurgerMenuComponent orderBurgerMenuComponent){
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