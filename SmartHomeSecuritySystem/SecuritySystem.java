package SmartHomeSecuritySystem;

import java.util.ArrayList;
import java.util.List;

public class SecuritySystem {
    private SecuritySystemState state;
    private List<Security> observers = new ArrayList<>();
    
    public SecuritySystem(){
        this.state = new DisarmedState();
    }
    
    public void addObserver(Security security){
        observers.add(security);
    }

    public void removeObserver(Security security){
        observers.remove(security);
    }

    public void notifyObservers(){
        for(Security observer: observers){
            observer.update(state.getStateName());
        }
    }

    public void setState(SecuritySystemState state) {
        this.state = state;
        notifyObservers();
    }

    public void arm() {
        state.arm(this);
    }

    public void triggerAlert() {
        state.triggerAlert(this);
    }

    public void disarm() {
        state.disarm(this);
    }
    
}
