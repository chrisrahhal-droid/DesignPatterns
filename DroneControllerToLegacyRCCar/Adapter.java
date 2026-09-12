package DroneControllerToLegacyRCCar;

public class Adapter implements ModernDroneController {

    private final LegacyRCController lRCc;

    public Adapter(LegacyRCController lRCc){
        this.lRCc = lRCc;
    }


    @Override
    public void move(int units) {
        int engineTickets = units * 10;
        lRCc.goForward(engineTickets);
    }

    @Override
    public void turn(String direction) {
        if(direction.equals("LEFT")){
            lRCc.spin(-90);
        }else if(direction.equals("RIGHT")){
            lRCc.spin(90);
        }
    }
    
}
