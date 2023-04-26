package PizzaExpress;

public class Tomato extends Vegetable{

    int weight;

    public Tomato(int weight) {
        this.weight = weight;
    }

    @Override
    public int getCost() {
        return this.weight * 12000;
    }
}
