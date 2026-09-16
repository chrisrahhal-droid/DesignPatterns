package SmartCampusSystem;

public class RoleCheck extends Handler{

    @Override
    public boolean handle(AccessRequest request) {
        Role role = request.getRole();
        if(!role.equals(Role.STUDENT) && !role.equals(Role.SECURITY) && !role.equals(Role.STAFF)){
            System.out.println("Access Denied");
            return false;
        }
        System.out.println("users with role " + role + " can access the system");
        return next.handle(request);
    }
    
}
