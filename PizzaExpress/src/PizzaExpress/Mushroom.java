package PizzaExpress;

public class Mushroom extends Vegetable{

    int weight;
    boolean canned;

    public Mushroom(int weight, boolean canned) {
        this.weight = weight;
        this.canned = canned;
    }

    @Override
    public int getCost() {
        int cost=this.weight *30000;
        if (canned){
            cost+=4000;
        }
        return cost;
    }
}
