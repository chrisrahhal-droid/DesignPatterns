package MediaProcessingApplication;

public class AudioFactory extends MediaFactory {

    @Override
    public Media createMedia() {
        return new Audio();
    }
    
}
