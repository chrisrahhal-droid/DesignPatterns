package GalacticEmpireSimulator;

public abstract class Drone {
    private String mission; 

    public void setMission(String mission){
        this.mission = mission;
    }

    public void act(){
        System.out.println("On "+ mission + " mission");
    }

    public abstract Drone cloneDrone();
}
