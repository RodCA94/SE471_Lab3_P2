public class LatteCoffee extends AbstractCoffee {

    public LatteCoffee(CMM machine) {
        super(machine);
    }

    @Override
    protected void grind() {
        machine.setGrindingTime(8);
    }

    @Override
    protected void heatWater() {
        machine.setTemperature(180);
        machine.holdTemperature(5);
    }

    @Override
    protected int getFinishTime() {
        return 13;
    }

    @Override
    protected int getLEDType() {
        return 3;
    }

    @Override
    public double getCost() {
        return 3.00;
    }

    @Override
    public String getDescription(){
        return "Latte";
    }
}
