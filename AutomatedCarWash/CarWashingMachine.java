public class CarWashingMachine {
    private final WaterSystem waterSystem;
    private final SoapDispenser soapDispenser;
    private final DryingFans dryingFans;

    public CarWashingMachine(WaterSystem waterSystem, SoapDispenser soapDispenser, DryingFans dryingFans) {
        this.waterSystem = waterSystem;
        this.soapDispenser = soapDispenser;
        this.dryingFans = dryingFans;
    }

    public void startBasicWash() {
        waterSystem.soak();
        soapDispenser.applyFoam();
        waterSystem.rinse();
    }

    public void startPremiumWash() {
        waterSystem.soak();
        soapDispenser.applyFoam();
        soapDispenser.applyFoam();
        waterSystem.rinse();
        dryingFans.activateHighPower();
    }

}
