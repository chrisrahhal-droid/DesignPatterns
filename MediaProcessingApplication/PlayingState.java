package MediaProcessingApplication;

public class PlayingState implements MediaState{

    @Override
    public void play(Media media) {
        System.out.println(media.getMediaType() + " is already playing");
    }

    @Override
    public void stop(Media media) {
        media.setMediaState(new StoppedState());
        System.out.println(media.getMediaType() + " is stopped");
    }
    
}
