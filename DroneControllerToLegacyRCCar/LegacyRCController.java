package DroneControllerToLegacyRCCar;

public class LegacyRCController {
    public void goForward(int engineTicks){
        System.out.println("Going forward with " + engineTicks + " engine ticks");
    }

    public void spin(int degrees){
        System.out.println("Spinning " + degrees + " degrees");
    }
}
