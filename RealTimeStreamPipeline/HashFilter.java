public class HashFilter extends BaseFilter {
    public HashFilter(StreamProcessor streamProcessor) {
        super(streamProcessor);
    }

    public String process(String data) {
        String text = super.process(data);
        return text + " -> [HASHED]";
    }

}
