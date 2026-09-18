package OnlineFileStorageSystem;

public class PDF extends BaseFile{

    @Override
    public void download() {
        System.out.println("Downloading PDF file");
    }
    
    @Override
    public String getDescription() {
        return "PDF";
    }
    
}
