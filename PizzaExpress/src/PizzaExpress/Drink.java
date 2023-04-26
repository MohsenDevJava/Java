package PizzaExpress;

public class Drink extends OrderPizza{

    String name;
    int  weight;
    boolean carbonated;

    public Drink(String name, int weight, boolean carbonated) {
        this.name = name;
        this.weight = weight;
        this.carbonated = carbonated;
    }

    @Override
    public int getCost() {
        int cost= this.weight*20;
        if (carbonated){
            cost+=4000;
        }
        return cost;
    }
}
