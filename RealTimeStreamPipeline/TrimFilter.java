public class TrimFilter extends BaseFilter {

    public TrimFilter(StreamProcessor streamProcessor) {
        super(streamProcessor);
    }

    public String process(String data) {
        String text = super.process(data);
        text = text.trim();
        return text;
    }
}
