package MediaProcessingApplication;

public class App {
    public static void main(String[] args){
        MediaFactory videoFactory = new VideoFactory();
        Media video = videoFactory.createMedia();
        video.play();
        video.stop();
        video.stop();
    }
}
