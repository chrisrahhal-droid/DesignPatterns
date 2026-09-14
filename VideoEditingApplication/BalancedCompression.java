package VideoEditingApplication;


public class BalancedCompression implements VideoCompression{

    @Override
    public void compress(VideoProject videoProject) {
        System.out.println("Compression " + videoProject.getProjectName() + " on balanced quality");
    }

}
