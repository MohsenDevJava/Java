package PizzaExpress;

public class Cheese extends ContentPizza{

    int weight;

    public Cheese(int weight) {
        this.weight = weight;
    }

    @Override
    public int getCost() {
        return this.weight*87000;
    }
}
