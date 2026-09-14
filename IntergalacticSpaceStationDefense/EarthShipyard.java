package IntergalacticSpaceStationDefense;

public class EarthShipyard extends Shipyard{

    @Override
    public Fighter createFighter() {
        return new EarthFighter();
    }
    
}
