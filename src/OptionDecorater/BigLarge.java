package OptionDecorater;

public class BigLarge extends SizeUp {

    @Override
    public void prepareBurgerIngredient() {
        // 무엇을 넣어야 할까?
        ..
    }

    @Override
    public String getDescription() {
        return (orderBurgerMenuComponent.getDescription() + "This BurgerMenu upgrade to BigLarge sizeUp");
    }
}
