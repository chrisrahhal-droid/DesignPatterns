package OnlineFileStorageSystem;

public class PublicAccess implements FileAccessLevel{

    @Override
    public void open() {
        System.out.println("Opening file");
    }
    
}
