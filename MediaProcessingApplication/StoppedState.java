package MediaProcessingApplication;

public class StoppedState implements MediaState {

    @Override
    public void play(Media media) {
        media.setMediaState(new PlayingState());
        System.out.println(media.getMediaType() + " is played");
    }

    @Override
    public void stop(Media media) {
        System.out.println(media.getMediaType() + " is already stopped");
    }
    
}
