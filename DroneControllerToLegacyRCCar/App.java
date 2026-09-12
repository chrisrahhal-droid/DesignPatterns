package DroneControllerToLegacyRCCar;

public class App {
    public static void main(String[] args){
        LegacyRCController lRCc = new LegacyRCController();
        ModernDroneController adapter = new Adapter(lRCc);
        adapter.move(5);    
        adapter.turn("RIGHT");
    }
}
