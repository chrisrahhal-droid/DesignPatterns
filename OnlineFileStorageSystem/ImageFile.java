package OnlineFileStorageSystem;

public class ImageFile extends BaseFile{

    @Override
    public void download() {
        System.out.println("Downloading an image file");
    }

    @Override
    public String getDescription() {
        return "Image";
    }
    
}
