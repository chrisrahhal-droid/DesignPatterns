package SecureDataExporter;

public class CompressDecorator extends ExportDecorator {

    public CompressDecorator(DataExporter dataExporter) {
        super(dataExporter);
    }

    @Override 
    public String export(String data){
        String result = super.export(data);
        return result + " -> [Compressed]";
    }

}
