package PizzaExpress;

public enum PizzaSize {

    MINI(2),MEDIUM(4),LARGE(6);

    protected final int values;

    PizzaSize(int values) {
        this.values = values;
    }
}
