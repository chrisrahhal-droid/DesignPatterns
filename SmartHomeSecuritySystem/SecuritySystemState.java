package SmartHomeSecuritySystem;

public interface SecuritySystemState {
    void arm(SecuritySystem securitySystem);
    void triggerAlert(SecuritySystem securitySystem);
    void disarm(SecuritySystem securitySystem);
    String getStateName();
}
