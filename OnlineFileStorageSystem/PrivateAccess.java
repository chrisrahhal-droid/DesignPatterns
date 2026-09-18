package OnlineFileStorageSystem;

public class PrivateAccess implements FileAccessLevel{

    @Override
    public void open() {
        System.out.println("Checking user permissions");
    }
    
}
