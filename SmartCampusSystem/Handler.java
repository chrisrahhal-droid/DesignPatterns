package SmartCampusSystem;

public abstract class Handler {
    protected Handler next;

    public void setNext(Handler handler) {
        this.next = handler;
    }
    
    public abstract boolean handle(AccessRequest request);
}
