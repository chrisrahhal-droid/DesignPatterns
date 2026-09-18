package OnlineFileStorageSystem;

public interface File {
    void open();
    void download();
    void compress();
    String getDescription();
    void setCompressionStrategy(CompressionStrategy compressionStrategy);
    void setAccessLevel(FileAccessLevel fileAccessLevel);
}
