package GalacticEmpireSimulator;

public class HumanTechFactory extends TechFactory{

    @Override
    public Engine createEngine() {
        return new HumanEngine();
    }

    @Override
    public Weapon createWeapon() {
        return new HumanWeapon();
    }
    
}
