public class RawStream implements StreamProcessor {

    @Override
    public String process(String data) {
        return "Payload: " + data;
    }

}
