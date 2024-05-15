import java.util.ArrayList;
import java.util.List;

abstract class Pizza {
    String name;
    List<String>toppings = new ArrayList<>();

    public Pizza(String name){
        this.name = name;
    }
    public void addTopping(String topping){
        toppings.add(topping);
    }

    public abstract int calculateCost();

    public void printDetails(){
        System.out.println("Pizza: " +name);
        System.out.println("Toppings: "+toppings);
        System.out.println("Cost: "+calculateCost());
    }
}

