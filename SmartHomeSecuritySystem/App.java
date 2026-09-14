package SmartHomeSecuritySystem;

public class App {
    public static void main(String[] args){
        SecuritySystem securitySystem = new SecuritySystem();
        Security securityCamera = new SecurityCamera();
        Security smartSiren = new SmartSiren();
        Security mobileApp = new MobileApp();
        securitySystem.addObserver(securityCamera);
        securitySystem.addObserver(smartSiren);
        securitySystem.addObserver(mobileApp);
        securitySystem.arm();
        securitySystem.triggerAlert();
        securitySystem.removeObserver(smartSiren);
        securitySystem.disarm();
    }
}
