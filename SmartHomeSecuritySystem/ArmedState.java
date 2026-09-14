package SmartHomeSecuritySystem;

public class ArmedState implements SecuritySystemState{

    @Override
    public void disarm(SecuritySystem securitySystem) {
    }

    @Override
    public void triggerAlert(SecuritySystem securitySystem) {
        securitySystem.setState(new AlertState());
        System.out.println("Security system has been set to Alert state");
    }

    @Override
    public void arm(SecuritySystem securitySystem) {
        System.out.println("Security system is already on Armed state");
    }

    @Override
    public String getStateName() {
        return "Armed";
    }


    
}
