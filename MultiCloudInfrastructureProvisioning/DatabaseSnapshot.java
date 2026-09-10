public class DatabaseSnapshot implements Cloneable {
    private String env;

    public DatabaseSnapshot() {
        System.out.println("Simulating heavy network call...");
    }

    public void setEnvironment(String env) {
        this.env = env;
    }

    @Override
    public DatabaseSnapshot clone() {
        try {
            return (DatabaseSnapshot) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void inspect() {
        System.out.println("Database Snapshot Environment: " + this.env);
    }
}
