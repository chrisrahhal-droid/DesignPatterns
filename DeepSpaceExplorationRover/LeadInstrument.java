package DeepSpaceExplorationRover;

public class LeadInstrument extends BasePayloadUnit{

    public LeadInstrument(PayloadUnit unit) {
        super(unit);
    }

    @Override  
    public int getPowerDraw(){
        return super.getPowerDraw() + 20;
    }
}
