package OnlineFileStorageSystem;

public class EncryptedFile extends BaseFileDecorator{

    public EncryptedFile(File file) {
        super(file);
    }
    
    @Override 
    public String getDescription(){
        return super.getDescription() + " + Encryption";
    }
}
