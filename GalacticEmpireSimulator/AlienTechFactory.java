package GalacticEmpireSimulator;

public class AlienTechFactory extends TechFactory {

    @Override
    public Engine createEngine() {
        return new AlienEngine();
    }

    @Override
    public Weapon createWeapon() {
        return new AlienWeapon();
    }
    
}
