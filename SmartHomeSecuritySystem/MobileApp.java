package SmartHomeSecuritySystem;

public class MobileApp implements Security {

    @Override
    public void update(String status) {
        System.out.println("Mobile app status has changed to " + status);
    }
    
}
