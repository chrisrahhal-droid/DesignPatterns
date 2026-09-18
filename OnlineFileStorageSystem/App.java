package OnlineFileStorageSystem;

public class App {
    public static void main(String[] args){
        FileFactory pdfFactory = new PDFFactory();
        File CV = pdfFactory.createFile();
        CV.open();
        CV.setCompressionStrategy(new HighQualityCompression());
        CV.compress();
        CV.download();
        File id = new ImageFactory().createFile();
        id.setAccessLevel(new PrivateAccess());
        id.open();        
        id = new EncryptedFile(id);
        System.out.println(id.getDescription());
    }
    
}
