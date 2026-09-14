package DeepSpaceExplorationRover;

public class ThermalInstrument extends BasePayloadUnit{

    public ThermalInstrument(PayloadUnit unit) {
        super(unit);
    }

    @Override 
    public int getPowerDraw(){
        return super.getPowerDraw() + 10;
    }
    
}
