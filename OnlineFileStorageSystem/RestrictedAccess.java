package OnlineFileStorageSystem;

public class RestrictedAccess implements FileAccessLevel{

    @Override
    public void open() {
        System.out.println("Checking administrator permissions");
    }
    
}
