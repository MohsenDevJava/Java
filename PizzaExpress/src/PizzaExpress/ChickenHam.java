package PizzaExpress;

public class ChickenHam extends Meat{

    int weight;

    public ChickenHam(int weight) {
        this.weight = weight;
    }

    @Override
    public int getCost() {
        return this.weight * 100000;
    }
}
