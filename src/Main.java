public class Main {
    public static void main(String[] args) {

        CMM machine = new CMM();

        // Test 1
        System.out.println("TEST 1:");
        CoffeeIF coffee1 = new MochaCoffee(machine);
        coffee1 = new ChocolateDecorator(coffee1);

        coffee1.makeCoffee();
        machine.displayPrice(coffee1);
        machine.recordSale(coffee1);

        // Test 2
        System.out.println("\nTEST 2:");
        CoffeeIF coffee2 = new EspressoCoffee(machine);
        coffee2 = new CreamDecorator(coffee2);
        coffee2 = new VanillaDecorator(coffee2);
        coffee2 = new ChocolateDecorator(coffee2);
        coffee2 = new ChocolateDecorator(coffee2);

        coffee1.makeCoffee();
        machine.displayPrice(coffee2);
        machine.recordSale(coffee2);
    }
}
