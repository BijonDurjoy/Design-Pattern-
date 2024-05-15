class VeggiePizza extends Pizza{
    public VeggiePizza(){
        super("Veggie Pizza");
    }

    @Override
    public int calculateCost() {
        return 10+2 * toppings.size();
    }
}
