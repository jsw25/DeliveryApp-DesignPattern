package IngrediementsOfBurgerStore;

import cheese.Cheese;
import cheese.ReggianoCheese;
import clam.Clams;
import clam.FreshClams;
import dough.Dough;
import dough.ThinCrustDough;
import pepperoni.Pepperoni;
import pepperoni.SlicedPepperoni;
import sauce.MarinaraSauce;
import sauce.Sauce;
import veggies.*;

//원래 가져와서 생성하는 것이었나?? -> 그런듯.. family 특성에 맞게 구분해주기 위해서
public class 구성재료맥도날드 implements IngrediementsOfBurgerStore {
    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Garlic(), new Mushroom(),new Onion(),new RedPepper()};
        return veggies;
    }
}
