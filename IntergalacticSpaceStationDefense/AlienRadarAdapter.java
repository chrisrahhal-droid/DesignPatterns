package IntergalacticSpaceStationDefense;

public class AlienRadarAdapter implements ModernScanner{

    private final LegacyAlienRadar legacyAlienRadar;
    
    public AlienRadarAdapter(LegacyAlienRadar legacyAlienRadar){
        this.legacyAlienRadar = legacyAlienRadar;
    }

    @Override
    public void scanArea(String coordinates) {
        int x = Integer.parseInt(coordinates.substring(0, coordinates.indexOf(',')));
        int y = Integer.parseInt(coordinates.substring(coordinates.indexOf(',') + 1));
        legacyAlienRadar.pingSector(x, y);
    }
    
}
