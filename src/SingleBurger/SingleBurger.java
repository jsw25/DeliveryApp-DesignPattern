package SingleBurger;

import Bread.Bread;
import OrderMenuComponent.OrderBurgerMenuComponent;
import ToppingHam.ToppingHam;
import Veggies.Veggies;
import cheese.Cheese;
import clam.Clams;
import sauce.Sauce;

public abstract class SingleBurger extends OrderBurgerMenuComponent {
    private int cost; // toString하면서 계산된다.
    // ---------------------------------------
    protected String burgerName;

    protected Bread bread;
    protected Cheese cheese;
    protected Sauce sauce;
    protected Clams clam;
    protected ToppingHam toppingHam;
    protected Veggies[] veggies;

    public abstract void prepareBurgerIngredient();//abstract void prepare();


    //void bake(){System.out.println("Bake for 25 minutes at 350");}
    /*void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }
    void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

     */

    public void setName(String name){
        this.burgerName = name;
    }
    public String getName(){return this.burgerName;}

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("---- " + burgerName + " ----\n");
        if (bread != null) {
            result.append(bread);
            result.append("\n");
        }
        if (sauce != null) {
            result.append(sauce);
            result.append("\n");
        }
        if (cheese != null) {
            result.append(cheese);
            result.append("\n");
        }
        if (veggies != null) {
            for (int i = 0; i < veggies.length; i++) {
                result.append(veggies[i]);
                if (i < veggies.length-1) {
                    result.append(", ");
                }
            }
            result.append("\n");
        }
        if (clam != null) {
            result.append(clam);
            result.append("\n");
        }
        if (toppingHam != null) {
            result.append(toppingHam);
            result.append("\n");
        }
        return result.toString();
    }
    // 구현..
}
