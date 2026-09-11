package GalacticEmpireSimulator;

public class ScoutSpawner extends DroneSpawner{

    @Override
    public Drone createBaseDrone() {
        return new ScoutDrone();
    }
    
}
