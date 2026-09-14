package IntergalacticSpaceStationDefense;

public class App {
    public static void main(String[] args){
        CommandCenter commandCenter = CommandCenter.getInstance();
        commandCenter.setAlertLevel("RED");
        SatelliteConstruction satelliteConstruction = new SatelliteConstruction.Builder("Sentinel-1").setLaserPower(120).setStealthMode(true).build();
        satelliteConstruction.printSpecs();
        Shipyard shipyard = new EarthShipyard();
        shipyard.deployFighter();
        LegacyAlienRadar legacyAlienRadar = new LegacyAlienRadar();
        ModernScanner modernScanner = new AlienRadarAdapter(legacyAlienRadar);
        modernScanner.scanArea("42,99");
    }
}
