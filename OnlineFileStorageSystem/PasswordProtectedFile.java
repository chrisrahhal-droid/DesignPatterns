package OnlineFileStorageSystem;

public class PasswordProtectedFile extends BaseFileDecorator{

    public PasswordProtectedFile(File file) {
        super(file);
    }

    @Override 
    public String getDescription(){
        return super.getDescription() + " Password Protection";
    }
}
