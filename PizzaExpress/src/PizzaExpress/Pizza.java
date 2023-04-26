package PizzaExpress;

import java.util.ArrayList;
import java.util.List;

public class Pizza extends OrderPizza {

    private String name;
    private PizzaSize pizzaSize;
    private List<ContentPizza> contentPizza;

    public Pizza(String name, PizzaSize pizzaSize) {
        this.name = name;
        this.pizzaSize = pizzaSize;
        this.contentPizza = new ArrayList<>();
    }

    public void addContentToPizza(ContentPizza item){
        contentPizza.add(item);
    }

    @Override
    public int getCost() {
        int sum = 0;
        for (ContentPizza content:contentPizza){
            sum+=content.getCost();
        }
        return pizzaSize.values + sum;
    }
}
