public class AuditFilter extends BaseFilter {

    public AuditFilter(StreamProcessor streamProcessor) {
        super(streamProcessor);
    }

    public String process(String data) {
        String text = super.process(data);
        return "[AUDIT-LOG] " + text;
    }
}
