package cheese;

public class ReggianoCheese implements Cheese {
	private static final int cost = 550;// 정하는 것임!

	public int getCost(){return cost;}
	public String toString() {
		return "Reggiano Cheese("+ getCost() +"won)";
	}
}
