package PlayDeliveryApp;

import DeliveryFoodStore.DeliveryFoodStore;

import java.util.HashMap;
import java.util.Vector;

public class DeliveryApp {
    private HashMap<String, String> customerDeliveryInformation;
    private HashMap<String, String> customerPrivacyInformation;
    private HashMap<String, String> orderInformation;
    private HashMap<String, Vector<String>> deliveryFoodStoreInformation;

    public DeliveryApp(){
        //(생성자:가게와 해당 가게 메뉴들을 담당하는 컬랙션이 생성) HashMap에 원소가 백터..<String, Vector<String>>
        //(생성자: 음식 종류, 가게이름, 가게지점, 세트메뉴,사이즈up이 있는 HashMap도 생성된다. <String, String>)
    }
    public void play(){

    }


    public DeliveryPerson CallDeliveryPerson(HashMap<String, String> orderInformation, HashMap<String, String> customerDeliveryInformation){

        DeliveryPerson deliveryMan = new DeliveryPerson(orderInformation, customerDeliveryInformation);
        return deliveryMan;
    }
    public DeliveryFoodStore CalldeliveryFoodStore(HashMap<String, String> orderInformation){
        DeliveryFoodStore deliveryMan = new ~(orderInformation);
        // 자식 클래스
        return
    }





    public HashMap<String, String> getOrderInformation() {
        return orderInformation;
    } //필요없다면 삭제...

    public HashMap<String, Vector<String>> getDeliveryFoodStoreInformation() {
        return deliveryFoodStoreInformation;
    } //필요없다면 삭제...
    public HashMap<String, String> getCustomerDeliveryInformation() {
        return customerDeliveryInformation;
    } //필요없다면 삭제...
    private HashMap<String, String> getCustomerPrivacyInformation() {
        return customerPrivacyInformation;
    } //필요없다면 삭제...



    public void setOrderInformation(HashMap<String, String> orderInformation) {
        this.orderInformation = orderInformation;
    } //필요없다면 삭제...

    public void setDeliveryFoodStoreInformation(HashMap<String, Vector<String>> deliveryFoodStoreInformation) {
        this.deliveryFoodStoreInformation = deliveryFoodStoreInformation;
        // 순수하게 통채로 바꿔버린다.

    } //필요없다면 삭제...

    public void setCustomerDeliveryInformation(HashMap<String, String> customerDeliveryInformation) {
        this.customerDeliveryInformation = customerDeliveryInformation;
        // 순수하게 통채로 바꿔버린다.

    } //필요없다면 삭제...


    private void setCustomerPrivacyInformation(HashMap<String, String> customerPrivacyInformation) {
        this.customerPrivacyInformation = customerPrivacyInformation;
    } //필요없다면 삭제...


}

/*
* // 뭘 넣을까..?
        // 여기서 시작하는 걸로?
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        System.out.print(answer.getClass().getSimpleName() + " 타입이며, 길이는 " + answer.length());
* */
