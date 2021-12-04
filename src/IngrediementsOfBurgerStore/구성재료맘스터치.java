package IngrediementsOfBurgerStore;

import cheese.Cheese;
import cheese.MozzarellaCheese;
import clam.Clams;
import clam.FrozenClams;
import dough.Dough;
import dough.ThickCrustDough;
import pepperoni.Pepperoni;
import pepperoni.SlicedPepperoni;
import sauce.PlumTomatoSauce;
import sauce.Sauce;
import veggies.BlackOlives;
import veggies.Eggplant;
import veggies.Spinach;
import veggies.Veggies;

public class 구성재료맘스터치 implements IngrediementsOfBurgerStore {
    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new BlackOlives(), new Eggplant(),new Spinach()};
        return veggies;
    }
}
