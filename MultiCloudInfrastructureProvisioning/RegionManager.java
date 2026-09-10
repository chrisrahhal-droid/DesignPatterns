public class RegionManager {
    private static volatile RegionManager instance;
    private String region;

    private RegionManager() {
    }

    public static RegionManager getInstance() {
        if (instance == null) {
            synchronized (RegionManager.class) {
                if (instance == null) {
                    instance = new RegionManager();
                }
            }
        }
        return instance;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
