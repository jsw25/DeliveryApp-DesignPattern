package ChickenBurger;

import IngrediementsOfBurgerStore.IngrediementsOfBurgerStore;
import SingleBurger.ChickenBurger;

public class ThighBurger extends ChickenBurger {

    // 이거는 각 종 피자에 속했으며, pizzaIngrediementFactory에서 제공했음..
    IngrediementsOfBurgerStore ingrediementsOfBurgerStore;

    public ThighBurger(IngrediementsOfBurgerStore ingrediementsOfBurgerStore) {
        this.ingrediementsOfBurgerStore = ingrediementsOfBurgerStore;
    }

    public void prepareBurgerIngredient() {
        System.out.println("Preparing " + burgerName);
        bread = ingrediementsOfBurgerStore.createDough();
        sauce = ingrediementsOfBurgerStore.createSauce();
        cheese = ingrediementsOfBurgerStore.createCheese();
        veggies = ingrediementsOfBurgerStore.createVeggies();
        // 확실하게 구현 x

    }
}
