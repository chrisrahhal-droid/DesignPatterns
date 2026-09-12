package SecureDataExporter;

public class BaseExporter implements  DataExporter{

    @Override
    public String export(String data) {
        return("Raw Data: " + data);
    }
    
}
