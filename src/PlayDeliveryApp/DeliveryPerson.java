package PlayDeliveryApp;

import Vehicle.Vehicle;

public class DeliveryPerson {
    Vehicle vehicle;
    public DeliveryPerson(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    // 주문을 받고.. takeOrders() => 여기서 지점과 시간대 입력을 받는다..
    // 이동하고 방문하고.. visitBurgerStore()
    // 받고 고객에게 이동하자!  deliverToCustomer()
}
