package PizzaExpress;

public class Chicken extends Meat{

    int weight;

    public Chicken(int weight) {
        this.weight = weight;
    }

    @Override
    public int getCost() {
        return this.weight*145000;
    }
}
