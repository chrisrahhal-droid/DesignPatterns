package DeepSpaceExplorationRover;

public abstract class PayloadUnit {
    protected String name;
    protected int powerDraw;

    public PayloadUnit(String name, int powerDraw){
        this.name = name; 
        this.powerDraw = powerDraw;
    }
    public abstract int getPowerDraw();
}
