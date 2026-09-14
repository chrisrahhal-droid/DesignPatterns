package VideoEditingApplication;

public class HighQualityCompression implements VideoCompression {

    @Override
    public void compress(VideoProject videoProject) {
         System.out.println("Compressing " + videoProject.getProjectName() + " on high quality");
    }

}
