package OrderMenuComponent;

public abstract class OrderMenuComponent {
    protected int totalCost;
    protected String description = "";
    protected String storeName, storeBranch, storeFoodType; // 가게 이름, 가게 지점, 가게 음식 유형

    public abstract void prepareBurgerIngredient();

    public int getTotalCost(){
        return totalCost;
    }
    public String getDescription(){
        return description;
    }
    public void setStoreName(String storeName){
        this.storeName = storeName;
        //
    };//

    public String getStoreName(){return storeName;};

    public String toString(){};
}
