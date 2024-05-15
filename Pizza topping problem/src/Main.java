
public class Main {
    public static void main(String[] args) {
        Pizza veggiePizza = new VeggiePizza();
        veggiePizza.addTopping("Mushrooms");
        veggiePizza.addTopping("Onions");
        veggiePizza.addTopping("Chili");

        Pizza meatPizza = new MeatPizza();
        meatPizza.addTopping("Chicken");
        meatPizza.addTopping("Sausage");

        veggiePizza.printDetails();
        meatPizza.printDetails();
    }
}

/* OUTPUT:
Pizza: Veggie Pizza
Toppings: [Mushrooms, Onions, Chili]
Cost: 16
Pizza: Meat Pizza
Toppings: [Chicken, Sausage]
Cost: 18
 */