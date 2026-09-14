package IntergalacticSpaceStationDefense;

public abstract class Shipyard {
    public abstract Fighter createFighter();
    public void deployFighter(){
        Fighter fighter = createFighter();
        fighter.attack();
    }
}
