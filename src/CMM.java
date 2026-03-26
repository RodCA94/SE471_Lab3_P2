import java.util.ArrayList;
import java.util.List;

public class CMM {

    private List<CoffeeIF> sales = new ArrayList<>();

    public void recordSale(CoffeeIF coffee) {
        sales.add(coffee);
    }

    public void displayPrice(CoffeeIF coffee) {
        System.out.println("Coffee: " + coffee.getDescription());
        System.out.println("Final price: $" + coffee.getCost());
    }

    // makeCoffee() operation
    public void setPowerLED(int num) {
        if (num == 1) {
            System.out.println("Power LED: Machine is running");
        } else {
            System.out.println("Power LED: Machine is not running");
        }
    }

    public void setTypeLED(int num) {
        switch (num) {
            case 1:
                System.out.println("Type LED: Regular");
                break;
            case 2:
                System.out.println("Type LED: Mocha");
                break;
            case 3:
                System.out.println("Type LED: Latte");
                break;
            case 4:
                System.out.println("Type LED: Espresso");
                break;
            case 5:
                System.out.println("Type LED: Cappuccino");
                break;
            default:
                System.out.println("Invalid Type");
        }
    }

    public void setGrindingTime(int seconds) {
        System.out.println("Grinding coffee beans for " + seconds + " seconds");
    }

    public void setTemperature(int temp){
        System.out.print("Heating up water to " + temp + " degrees F");
    }

    public void holdTemperature(int seconds){
        System.out.println(" and holding temperature for " + seconds + " seconds.");
    }

    public void wait(int seconds){
        System.out.println("Waiting for " + seconds + " seconds.");
    }
}
