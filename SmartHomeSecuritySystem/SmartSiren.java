package SmartHomeSecuritySystem;

public class SmartSiren implements Security{

    @Override
    public void update(String status) {
        System.out.println("Smart siren status has changed to " + status);
    }
    
}
