package OnlineFileStorageSystem;

public class VideoFactory extends FileFactory {

    @Override
    public File createFile() {
        return new VideoFile();
    }
    
}
