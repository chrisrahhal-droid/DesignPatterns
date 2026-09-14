package IntergalacticSpaceStationDefense;

public class MarsShipyard extends Shipyard{

    @Override
    public Fighter createFighter() {
        return new MarsFighter();
    }
    
}
