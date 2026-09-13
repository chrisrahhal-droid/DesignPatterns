public abstract class BaseFilter implements StreamProcessor {
    private StreamProcessor streamProcessor;

    public BaseFilter(StreamProcessor streamProcessor) {
        this.streamProcessor = streamProcessor;
    }

    @Override
    public String process(String data) {
        return streamProcessor.process(data);
    }

}
