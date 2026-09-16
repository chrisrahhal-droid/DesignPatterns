package SmartCampusSystem;

public class TimeWindowCheck extends Handler {

    @Override
    public boolean handle(AccessRequest request) {
        int hour = request.getHour();
        Role role = request.getRole();
        if(role.equals(Role.STUDENT)){
            if(hour < 20 && hour > 8){
                System.out.println("user with role " + role + " is within time window");
                return true;
            }
        }else if(role.equals(Role.STAFF)){
            if(hour < 22 && hour > 7){
                System.out.println("user with role " + role + " is within time window");
                return true;
            }
        }else if(role.equals(Role.SECURITY)){
            System.out.println("user with role " + role + " can access at any time");
            return true;
        }
        System.out.println("users with the role " + role + " can't access during this hour " + hour );
        return false;
    }
}
