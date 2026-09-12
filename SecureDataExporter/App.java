package SecureDataExporter;

public class App {
    public static void main(String[] args){
        BaseExporter exporter = new BaseExporter();
        DataExporter compressExporter = new CompressDecorator(exporter);
        DataExporter encryptExporter = new EncryptDecorator(compressExporter);
        System.out.println(encryptExporter.export("Financial_Report_Q3"));
    }
}
