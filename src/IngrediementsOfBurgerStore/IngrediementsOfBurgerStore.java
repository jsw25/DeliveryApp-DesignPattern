package IngrediementsOfBurgerStore;

import Bread.Bread;
import ToppingHam.ToppingHam;
import Veggies.Veggies;
import cheese.Cheese;
import clam.Clams;
import sauce.Sauce;

public interface IngrediementsOfBurgerStore {
    public Bread createDough();
    public Cheese createCheese();
    public Clams createClam();
    public Sauce createSauce();
    public Veggies[] createVeggies();
    public ToppingHam createPepperoni();

}

// 재료들 더 분석하기!
// create~()할 내용들 더 분석하기!
