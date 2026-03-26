public class CreamDecorator extends CoffeeDecorator{

    public CreamDecorator(CoffeeIF coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 0.25;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Cream";
    }
}
