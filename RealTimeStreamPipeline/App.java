public class App {
    public static void main(String[] args) {
        StreamProcessor processor = new TrimFilter(new HashFilter(new AuditFilter(new RawStream())));
        System.out.println(processor.process("  user_data_xyz  "));
    }
}
