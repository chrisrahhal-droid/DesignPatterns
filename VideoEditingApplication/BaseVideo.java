package VideoEditingApplication;

public abstract class BaseVideo extends VideoProject {

    protected VideoProject videoProject;

    public BaseVideo(VideoProject videoProject) {
        super(
            videoProject.getProjectName(),
            videoProject.getResolution(),
            videoProject.getFrameRate()
        );

        this.videoProject = videoProject;
    }

    @Override
    public String process() {
        return videoProject.process();
    }
}