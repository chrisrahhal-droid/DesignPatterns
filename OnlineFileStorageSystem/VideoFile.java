package OnlineFileStorageSystem;

public class VideoFile extends BaseFile{

    @Override
    public void download() {
        System.out.println("Downloading a video file");
    }

    @Override
    public String getDescription() {
        return "Video";
    }
    
}
