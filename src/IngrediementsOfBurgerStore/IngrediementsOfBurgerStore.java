package IngrediementsOfBurgerStore;

import cheese.Cheese;
import clam.Clams;
import dough.Dough;
import pepperoni.Pepperoni;
import sauce.Sauce;
import veggies.Veggies;

public interface IngrediementsOfBurgerStore {
    public Dough createDough();
    public Cheese createCheese();
    public Clams createClam();
    public Sauce createSauce();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();

}

// 재료들 더 분석하기!
// create~()할 내용들 더 분석하기!
