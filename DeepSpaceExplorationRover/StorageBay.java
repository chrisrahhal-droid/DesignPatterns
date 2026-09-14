package DeepSpaceExplorationRover;

import java.util.ArrayList;
import java.util.List;

public class StorageBay extends PayloadUnit{
    private List<PayloadUnit> units;

    public StorageBay(String name) {
        super(name,0);
        this.units = new ArrayList<>();
    }


    public void addUnit(PayloadUnit unit){
        units.add(unit);
    }

    public void removeUnit(PayloadUnit unit){
        units.remove(unit);
    }

    @Override
    public int getPowerDraw() {
        int total = 0;
        for(PayloadUnit unit : units){
            total += unit.getPowerDraw();
        }
        return total;
    }
    
}
