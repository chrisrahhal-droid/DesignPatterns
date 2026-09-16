package SmartCampusSystem;

public class AccessRequest {
    private final String userId;
    private final Role role;
    private final String doorId;
    private final int hour;

    public AccessRequest(String userId, Role role, String doorId, int hour){
        this.userId = userId;
        this.role = role;
        this.doorId = doorId;
        this.hour = hour;
    }

    public String getUserId() {
        return userId;
    }

    public Role getRole() {
        return role;
    }

    public String getDoorId() {
        return doorId;
    }

    public int getHour() {
        return hour;
    }

    
}
