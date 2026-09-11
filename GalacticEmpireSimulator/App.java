package GalacticEmpireSimulator;

public class App {
    public static void main(String[] args){
        UniversConfig.getInstance().setDifficulty("Hard");
        TechFactory alienFactory = new AlienTechFactory();
        Engine alienEngine = alienFactory.createEngine();
        Weapon weapon = alienFactory.createWeapon();
        Starship starship = new Starship.Builder("Zeta Vanguard").setEngine(alienEngine).setWeapon(weapon).build();
        starship.deploy();
        DroneSpawner scoutDroneSpawner = new ScoutSpawner();
        Drone drone = scoutDroneSpawner.dispatch("Recon");
        Drone clone = drone.cloneDrone();
        clone.setMission("Patrol");
        drone.act();
        clone.act();
    }
}
