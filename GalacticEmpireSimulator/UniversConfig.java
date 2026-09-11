package GalacticEmpireSimulator;

public class UniversConfig {
    private static volatile UniversConfig instance;
    private String difficulty;

    private UniversConfig (){
        if(instance != null){
            throw new IllegalStateException("UniversConfig instance already exists");
        }
    }

    public static UniversConfig getInstance(){
        if(instance == null){
            synchronized(UniversConfig.class){
                if(instance == null){
                    instance = new UniversConfig();
                }
            }
        }
        return instance;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

}
