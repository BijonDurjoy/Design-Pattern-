class MeatPizza extends Pizza{
    public MeatPizza(){
        super("Meat Pizza");
    }

    @Override
    public int calculateCost() {
        return 12+3 * toppings.size();
    }
}
