package DeepSpaceExplorationRover;

public class Insurument extends PayloadUnit {

    public Insurument(String name, int powerDraw) {
        super(name, powerDraw);
    }

    @Override
    public int getPowerDraw() {
        return super.powerDraw;
    }
    
}
