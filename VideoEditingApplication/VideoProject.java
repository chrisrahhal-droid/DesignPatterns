package VideoEditingApplication;


public class VideoProject implements Cloneable{
    private String projectName;
    private String resolution;
    private int frameRate;
    private VideoCompression compression;

    public VideoProject(String projectName, String resolution, int frameRate){
        this.projectName = projectName;
        this.resolution = resolution;
        this.frameRate = frameRate;
    }
    
    public void setCompression(VideoCompression compression) {
        this.compression = compression;
    }

    public VideoProject clone(){
        try {
            return (VideoProject) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getFrameRate() {
        return frameRate;
    }

    public void setFrameRate(int frameRate) {
        this.frameRate = frameRate;
    }

    public String process() {
       return "Processing " + projectName + " on resolution " + resolution + " and " + frameRate + " fps";
    }

    public void compress(){
        compression.compress(this);
    }

}
