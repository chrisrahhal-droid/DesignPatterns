package VideoEditingApplication;

public class App {
    public static void main(String[] args){
        VideoProject project = new VideoProject("my first project", "1080p", 120);
        VideoProject secondProject = project.clone();
        project = new Subtitle(new Watermark(project));
        secondProject.setProjectName("my second project");
        secondProject.setFrameRate(60);
        secondProject.setResolution("720p");
        System.out.println(project.process());
        System.out.println(secondProject.process());
        project.setCompression(new BalancedCompression());
        project.compress();
        project.setCompression(new HighQualityCompression());
        project.compress();
    }
}
