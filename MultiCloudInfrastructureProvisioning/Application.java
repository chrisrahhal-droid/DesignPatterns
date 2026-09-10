public abstract class Application {
    private String deployementID;

    public Application() {

    }

    public abstract void start();

    public String getDeployementID() {
        return deployementID;
    }

    public void setDeployementID(String deployementID) {
        this.deployementID = deployementID;
    }
}
