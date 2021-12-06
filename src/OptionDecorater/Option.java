package OptionDecorater;

import OrderMenuComponent.OrderBurgerMenuComponent;

public abstract class Option extends OrderBurgerMenuComponent {
    protected OrderBurgerMenuComponent orderBurgerMenuComponent;
    // 구현.. 메소드 abstract로 한단계 더 내린다!
    public String getDescription() {
        return description;
    }

}
