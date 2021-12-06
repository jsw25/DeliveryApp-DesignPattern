package OrderMenuComponent;

public abstract class OrderBurgerMenuComponent extends OrderMenuComponent {
    // 하는일??
    private int cost; // 아직 까지는 계산이 될 것이 없다.
    private boolean set; // 초기화 = false
    private boolean sizeUp; // 초기화 = false

    // 어디서 옮길 수 있을까?? => 초기화 작업??








}
/*
확실하게 다 정하기!
* /임시로 정한OrderMenuComponent/
--
#totalPrice:int - (그냥 메소드로 작성할 수도 있음!)
#버거 매점 이름/지점:String
#set:boolean - (초기화 = false)
#sizeUp:boolean - (초기화 = false)
#menuFeature:String(세트인가? sizeup했는가? 각 모두 가져와서 정보를 넣어 줄 것이다. 해당 구격을 정할 것이다! 해당 클래스에서 재공해주는 구성 가격을 받아와서 구성할 것이다!)
#setConfiguration:String -(감튀/음료수가 구성이라면 해당 클래스에서 재공해주는 구성 가격을 받아와서 구성할 것이다!)
--
/cost():int/
getMenuFeature():String
        gettotalPrice():int
        getBurgerSetConfiguration():String
        getStepSizeUp:String

        setSingleBurgerPrice():void
        setSizeUpPrice():void
        setBurgerSetConfiguration():void
        setPriceOfBurgerSetConfiguration():void
        ...(아직 다 정하지 못함..)
* */