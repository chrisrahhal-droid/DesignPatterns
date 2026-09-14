package SmartHomeSecuritySystem;

public class SecurityCamera implements Security {

    @Override
    public void update(String status) {
         System.out.println("Security Camera status has changed to " + status);
    }

}
