package IngrediementsOfBurgerStore;

import Bread.Bread;
import Bread.HamburgerBuns;
import ToppingHam.SlicedHam;
import ToppingHam.ToppingHam;
import Veggies.*;
import cheese.Cheese;
import cheese.ReggianoCheese;
import clam.Clams;
import clam.FreshClams;
import sauce.MarinaraSauce;
import sauce.Sauce;

//원래 가져와서 생성하는 것이었나?? -> 그런듯.. family 특성에 맞게 구분해주기 위해서
public class 구성재료롯데리아 implements IngrediementsOfBurgerStore {
    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }

    @Override
    public Bread createDough() {
        return new HamburgerBuns();
    }

    @Override
    public ToppingHam createPepperoni() {
        return new SlicedHam();
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
