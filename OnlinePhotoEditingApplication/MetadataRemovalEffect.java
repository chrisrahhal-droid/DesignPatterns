package OnlinePhotoEditingApplication;

public class MetadataRemovalEffect extends BasePhotoProject{

    public MetadataRemovalEffect(PhotoProject photoProject) {
        super(photoProject);
    }

    @Override 
    public String export(){
        return super.export() + " {Metadata removed}";
    }
    
}
