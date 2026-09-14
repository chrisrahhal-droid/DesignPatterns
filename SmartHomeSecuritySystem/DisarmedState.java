package SmartHomeSecuritySystem;

public class DisarmedState implements SecuritySystemState{

    @Override
    public void arm(SecuritySystem securitySystem) {
        securitySystem.setState(new ArmedState());
        System.out.println("Security system has been set to Armed state");
        
    }
  
    @Override
    public void triggerAlert(SecuritySystem securitySystem) {
    }

    @Override
    public void disarm(SecuritySystem securitySystem) {
        System.out.println("Security system is already on Disarmed state");
    }

    @Override
    public String getStateName() {
        return "Disarmed";
    }
    
}
