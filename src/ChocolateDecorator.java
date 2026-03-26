public class ChocolateDecorator  extends CoffeeDecorator{

    public ChocolateDecorator(CoffeeIF coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 1.00;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Chocolate";
    }
}
