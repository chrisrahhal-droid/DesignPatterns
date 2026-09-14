package SmartHomeSecuritySystem;

public class AlertState implements SecuritySystemState{

    @Override
    public String getStateName() {
        return "Alert";
    }

    @Override
    public void arm(SecuritySystem securitySystem) {
    }

    @Override
    public void triggerAlert(SecuritySystem securitySystem) {
            System.out.println("Security system is already on alert state");
    }

    @Override
    public void disarm(SecuritySystem securitySystem) {
        securitySystem.setState(new DisarmedState());
        System.out.println("Security system has been set to Disarmed state");
    }
    
}
