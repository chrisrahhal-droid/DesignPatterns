package SmartCampusSystem;

public class AccessController {
    private UserExistsCheck userHandler = new UserExistsCheck();
    private RoleCheck roleHandler = new RoleCheck();
    private TimeWindowCheck timeHandler = new TimeWindowCheck();
    private NumericDoorController numericDoorController = new NumericDoorController();
    private Door door;

    public AccessController(){
        userHandler.setNext(roleHandler);
        roleHandler.setNext(timeHandler);
        door = new LegacyDoorControllerAdapter(numericDoorController);
    }

    public void handleRequest(AccessRequest request){
       boolean result =  userHandler.handle(request);
        if(result){
            door.open(request.getDoorId());
        }
    }
}
