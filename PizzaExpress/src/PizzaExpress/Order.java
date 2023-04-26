package PizzaExpress;

import java.util.ArrayList;
import java.util.List;

public  class Order {

  Delivery delivery;
  List<OrderPizza> orderPizzaList = new ArrayList<>();

    public Order(Delivery delivery) {
        this.delivery = delivery;
    }

    public void addItemToOrder(OrderPizza item){
        orderPizzaList.add(item);
    }

    public int CalcOrderCost(){
        int sum=delivery.values;
        for (OrderPizza items:orderPizzaList){
            sum+= items.getCost();
        }
        return sum;
    }
}
