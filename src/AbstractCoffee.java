public abstract class AbstractCoffee implements CoffeeIF{

    protected CMM machine;

    public AbstractCoffee(CMM machine){
        this.machine = machine;
    }

    @Override
    public final void makeCoffee(){
        startMachine();
        grind();
        heatWater();
        finishMachine();
    }

    protected void startMachine(){
        machine.setPowerLED(1);
        machine.setTypeLED(getLEDType());
    }

    protected void finishMachine(){
        machine.wait(getFinishTime());
        machine.setPowerLED(0);
    }
    protected abstract void grind();
    protected abstract void heatWater();
    protected abstract int getFinishTime();
    protected abstract int getLEDType();
}
