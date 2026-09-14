package DeepSpaceExplorationRover;

public abstract class BasePayloadUnit extends PayloadUnit{
    private PayloadUnit unit;

    public BasePayloadUnit(PayloadUnit unit) {
        super(unit.name, unit.powerDraw);
        this.unit = unit;
    }

    @Override 
    public int getPowerDraw(){
        return unit.getPowerDraw();
    }
}
