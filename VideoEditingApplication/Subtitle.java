package VideoEditingApplication;

public class Subtitle extends BaseVideo {

    public Subtitle(VideoProject videoProject) {
        super(videoProject);
    }

    @Override 
    public String process(){
        return super.process() + " + [Subtitles]";
    }
}
