public class RegularCoffee extends AbstractCoffee {

    public RegularCoffee(CMM machine) {
        super(machine);
    }

    @Override
    protected void grind() {
        machine.setGrindingTime(8);
    }

    @Override
    protected void heatWater() {
        machine.setTemperature(150);
        machine.holdTemperature(2);
    }

    @Override
    protected int getFinishTime() {
        return 15;
    }

    @Override
    public double getCost(){
        return 1.00;
    }

    @Override
    public int getLEDType() {
        return 1;
    }
}
