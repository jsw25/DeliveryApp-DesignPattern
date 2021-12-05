package DeliveryFoodStore;

import OrderMenuComponent.OrderBurgerMenuComponent;

public abstract class BurgerStore extends DeliveryFoodStore {
    @Override
    public OrderBurgerMenuComponent orderBurgerMenu() {
        return ;
    }
    public abstract OrderBurgerMenuComponent createBurgerMenu();

}
