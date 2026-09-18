package OnlineFileStorageSystem;

public class PDFFactory extends FileFactory{

    @Override
    public File createFile() {
        return new PDF();
    }
    
}
