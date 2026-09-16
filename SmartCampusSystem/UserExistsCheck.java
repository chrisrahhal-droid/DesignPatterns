package SmartCampusSystem;

import java.util.List;

public class UserExistsCheck extends Handler {

    private List<String> users = List.of(
        "1",
        "2",
        "3"
    );

    @Override
    public boolean handle(AccessRequest request) {
        if(users.contains(request.getUserId())){
            System.out.println("user " + request.getUserId() + " exists in the system");
            return next.handle(request);
        }
        System.out.println("user " + request.getUserId() + " doens't exist in the system");
        return false;
    }
    
}
