public class Main {
    public static void main(String[] args) {

        CMM machine = new CMM();

        // Test 1
        CoffeeIF coffee1 = new MochaCoffee(machine);
        coffee1 = new ChocolateDecorator(coffee1);

        coffee1.makeCoffee();
        machine.displayPrice(coffee1);
        // store the sale in List
        machine.recordSale(coffee1);


    }

}
