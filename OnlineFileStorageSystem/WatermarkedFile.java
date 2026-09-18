package OnlineFileStorageSystem;

public class WatermarkedFile extends BaseFileDecorator{

    public WatermarkedFile(File file) {
        super(file);
    }

    @Override 
    public String getDescription(){
        return super.getDescription() + " + Watermark";
    }

}
