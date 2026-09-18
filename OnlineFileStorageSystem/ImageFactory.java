package OnlineFileStorageSystem;

public class ImageFactory extends FileFactory {

    @Override
    public File createFile() {
        return new ImageFile();
    }
    
}
