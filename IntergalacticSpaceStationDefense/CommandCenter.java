package IntergalacticSpaceStationDefense;

public class CommandCenter {
    private static volatile CommandCenter instance;
    private int totalCredits;
    private String alertLevel;

    private CommandCenter(){
        if (instance != null) {
            throw new IllegalStateException("CommandCenter instance already exists!");
        }
    }

    public static CommandCenter getInstance() {
        if(instance == null){
            synchronized(CommandCenter.class){
                if(instance == null){
                    instance = new CommandCenter();
                }
            }
        }
        return instance;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }

    public String getAlertLevel() {
        return alertLevel;
    }

    public void setAlertLevel(String alertLevel) {
        this.alertLevel = alertLevel;
    }
    
}
