public class CappuccinoCoffee extends AbstractCoffee {

    public CappuccinoCoffee(CMM machine) {
        super(machine);
    }

    @Override
    protected void grind() {
        machine.setGrindingTime(10);
    }

    @Override
    protected void heatWater() {
        machine.setTemperature(210);
        machine.holdTemperature(10);
    }

    @Override
    protected int getFinishTime() {
        return 25;
    }

    @Override
    protected int getLEDType() {
        return 5;
    }

    @Override
    public double getCost() {
        return 5.00;
    }

    @Override
    public String getDescription(){
        return "Cappuccino";
    }
}
