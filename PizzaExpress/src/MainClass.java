import PizzaExpress.*;

public class MainClass {
    public static void main(String[] args) {

        Order order1 = new Order(Delivery.MOTORCYCLE);
        order1.addItemToOrder(new Drink("pepsi",400,true));

        Pizza pizza1 = new Pizza("peperoni", PizzaSize.LARGE);
        pizza1.addContentToPizza(new Cheese(50));
        pizza1.addContentToPizza(new Chicken(100));
        pizza1.addContentToPizza(new Mushroom(200,false));
        pizza1.addContentToPizza(new Tomato(200));

        order1.addItemToOrder(pizza1);

        System.out.println(order1.CalcOrderCost());
    }
}