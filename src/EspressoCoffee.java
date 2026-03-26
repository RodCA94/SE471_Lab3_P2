public class EspressoCoffee extends AbstractCoffee {

    public EspressoCoffee(CMM machine) {
        super(machine);
    }

    @Override
    protected void grind() {
        machine.setGrindingTime(10);
    }

    @Override
    protected void heatWater() {
        machine.setTemperature(225);
        machine.holdTemperature(9);
    }

    @Override
    protected int getFinishTime() {
        return 20;
    }

    @Override
    protected int getLEDType() {
        return 4;
    }

    @Override
    public double getCost() {
        return 4.00;
    }

    @Override
    public String getDescription(){
        return "Espresso";
    }
}
