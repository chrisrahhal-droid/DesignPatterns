package DroneControllerToLegacyRCCar;

public interface ModernDroneController {
    public abstract void move(int units);
    public abstract void turn(String direction);
}
