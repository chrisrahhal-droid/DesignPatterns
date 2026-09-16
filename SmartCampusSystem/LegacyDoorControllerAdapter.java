package SmartCampusSystem;

public class LegacyDoorControllerAdapter implements Door {

    private NumericDoorController numericDoorController;

    public LegacyDoorControllerAdapter(NumericDoorController numericDoorController){
        this.numericDoorController = numericDoorController;
    }

    @Override
    public boolean open(String doorId) {
        int code = Integer.parseInt(doorId);
        return numericDoorController.openDoor(code);
    }
    
}
