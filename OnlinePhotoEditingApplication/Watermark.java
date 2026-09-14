package OnlinePhotoEditingApplication;

public class Watermark extends BasePhotoProject{

     public Watermark(PhotoProject photoProject) {
        super(photoProject);
    }

     @Override
    public String export() {
        return super.export() + " {Watermark}";
    }
    
}
