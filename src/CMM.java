import java.util.ArrayList;
import java.util.List;

public class CMM {

    private List<CoffeeIF> sales = new ArrayList<>();

    public void recordSale(CoffeeIF coffee) {
        sales.add(coffee);
    }

    public void displayPrice(CoffeeIF coffee) {
        System.out.println("Coffee: " + coffee.getLEDType());
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
        System.out.println("Type LED: " + num);
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
