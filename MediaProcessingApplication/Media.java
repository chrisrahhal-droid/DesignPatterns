package MediaProcessingApplication;

public abstract class Media {
    private MediaState mediaState;

    public Media(){
        this.mediaState = new StoppedState();
    }

    public abstract String getMediaType();

    public void setMediaState(MediaState mediaState) {
        this.mediaState = mediaState;
    }

    public void play(){
        mediaState.play(this);
    }
    public void stop(){
        mediaState.stop(this);
    }
  
}
