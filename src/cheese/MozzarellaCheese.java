package cheese;

public class MozzarellaCheese implements Cheese {
	private static final int cost = 600;// 정하는 것임!

	public int getCost(){return cost;}
	public String toString() {
		return "Shredded Mozzarella("+ getCost() +"won)";
	}
}
