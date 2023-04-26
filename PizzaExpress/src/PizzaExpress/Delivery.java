package PizzaExpress;

public enum Delivery {

    BIKE(2000),MOTORCYCLE(4000),DRONE(6000);

    protected final int values;

    Delivery(int values) {
        this.values = values;
    }
}
