package SecureDataExporter;

public class EncryptDecorator extends ExportDecorator {

    public EncryptDecorator(DataExporter dataExporter) {
        super(dataExporter);
    }

    @Override 
    public String export(String data){
        String result = super.export(data);
        return result + " -> [Encrypted]";
    }
    
}
