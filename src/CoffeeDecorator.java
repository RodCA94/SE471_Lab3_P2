public abstract class CoffeeDecorator implements CoffeeIF {

    protected CoffeeIF coffee;

    public CoffeeDecorator(CoffeeIF coffee) {
        this.coffee = coffee;
    }

    @Override
    public void makeCoffee() {
        coffee.makeCoffee();
    }

    @Override
    public abstract double getCost();

    @Override
    public abstract String getDescription();
}
