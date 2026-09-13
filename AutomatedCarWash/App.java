public class App {
    public static void main(String[] args) {
        WaterSystem waterSystem = new WaterSystem();
        SoapDispenser soapDispenser = new SoapDispenser();
        DryingFans dryingFans = new DryingFans();
        CarWashingMachine carWashingMachine = new CarWashingMachine(waterSystem, soapDispenser, dryingFans);

        carWashingMachine.startBasicWash();
        carWashingMachine.startPremiumWash();
    }
}
