package MediaProcessingApplication;

public class VideoFactory extends MediaFactory{

    @Override
    public Media createMedia() {
        return new Video();
    }
    
}
