public class MochaCoffee extends AbstractCoffee {

    public MochaCoffee(CMM machine) {
        super(machine);
    }

    @Override
    protected void grind() {
        machine.setGrindingTime(5);
    }

    @Override
    protected void heatWater() {
        machine.setTemperature(200);
        machine.holdTemperature(5);
    }

    @Override
    protected int getFinishTime() {
        return 15;
    }

    @Override
    public double getCost() {
        return 2.00;
    }

    @Override
    public int getLEDType() {
        return 2;
    }
}
