package DeepSpaceExplorationRover;

public class App {
    public static void main(String[] args){
        PayloadUnit spectrometer = new Insurument("Spectrometer", 100);
        spectrometer = new ThermalInstrument(new LeadInstrument(spectrometer));
        PayloadUnit leadCamera = new LeadInstrument(new Insurument("Camera", 50)); 
        StorageBay mainStorageBay = new StorageBay("Main Storage Bay");
        mainStorageBay.addUnit(leadCamera);
        StorageBay secondStorageBay = new StorageBay("Second Secure Bay");
        secondStorageBay.addUnit(spectrometer);
        mainStorageBay.addUnit(secondStorageBay);  
        Rover rover = new Rover.Builder("RVR-99").setPayloadUnit(mainStorageBay).commission();
        System.out.println(rover.getPayloadUnit().getPowerDraw());
    }
}
