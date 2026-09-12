package SecureDataExporter;

public abstract class ExportDecorator implements DataExporter{

    private DataExporter dataExporter;

    public ExportDecorator(DataExporter dataExporter){
        this.dataExporter = dataExporter;
    }

    @Override
    public String export(String data) {
       return dataExporter.export(data);
    }
    
}