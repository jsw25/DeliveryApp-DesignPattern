package SingleBurger;

import IngrediementsOfBurgerStore.IngrediementsOfBurgerStore;

public class ChickenBurger extends SingleBurger  {
    // 이거는 각 종 피자에 속했으며, pizzaIngrediementFactory에서 제공했음..
    IngrediementsOfBurgerStore ingrediementsOfBurgerStore;

    public ChickenBurger(IngrediementsOfBurgerStore ingrediementsOfBurgerStore) {
        this.ingrediementsOfBurgerStore = ingrediementsOfBurgerStore;
    }

    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingrediementsOfBurgerStore.createDough();
        sauce = ingrediementsOfBurgerStore.createSauce();
        cheese = ingrediementsOfBurgerStore.createCheese();
        veggies = ingrediementsOfBurgerStore.createVeggies();
    }
}
