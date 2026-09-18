package GalacticEmpireSimulator;

public abstract class DroneSpawner {
    public abstract Drone createBaseDrone();

    public Drone dispatch(String mission){
        Drone drone = createBaseDrone();
        drone.setMission(mission);
        return drone;
    }
}
