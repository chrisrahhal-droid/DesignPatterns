package SmartCampusSystem;

public class App {
    public static void main(String[] args){
        AccessController accessController = new AccessController();
        AccessRequest accessRequest = new AccessRequest("1", Role.STAFF, "1", 10);
        AccessRequest accessRequest2 = new AccessRequest("2", Role.STUDENT, "1", 23);
        AccessRequest accessRequest3 = new AccessRequest("3", Role.SECURITY, "1", 5);
        AccessRequest accessRequest4 = new AccessRequest("4", Role.SECURITY, "1", 5);
        accessController.handleRequest(accessRequest);
        accessController.handleRequest(accessRequest2);
        accessController.handleRequest(accessRequest3);
        accessController.handleRequest(accessRequest4);
    }
}
