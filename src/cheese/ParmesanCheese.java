package cheese;

public class ParmesanCheese implements Cheese {
	private static final int cost = 200;// 정하는 것임!

	public int getCost(){return cost;}
	public String toString() {
		return "Shredded Parmesan("+ getCost() +"won)";
	}

}
