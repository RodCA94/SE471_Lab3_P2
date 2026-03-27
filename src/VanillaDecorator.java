public class VanillaDecorator extends CoffeeDecorator {

    public VanillaDecorator(CoffeeIF coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 0.50;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Vanilla";
    }

}
