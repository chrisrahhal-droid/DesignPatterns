package GalacticEmpireSimulator;

public class ScoutDrone extends Drone implements Cloneable{

    @Override
    public Drone cloneDrone() {
        try{
            return (Drone) super.clone();
        }catch(CloneNotSupportedException e){
            throw new AssertionError();
        }
    }
    
}
