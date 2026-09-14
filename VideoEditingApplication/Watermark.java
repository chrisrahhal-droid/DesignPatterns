package VideoEditingApplication;

public class Watermark extends BaseVideo{

    public Watermark(VideoProject videoProject) {
        super(videoProject);
    }

    @Override 
    public String process(){
       return super.process() + " + [Watermark]";
    }
    
}
