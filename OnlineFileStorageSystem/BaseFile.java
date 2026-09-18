package OnlineFileStorageSystem;

public abstract class BaseFile implements File {
    private FileAccessLevel fileAccessLevel;
    private CompressionStrategy compressionStrategy = new BalancedCompression();

    public BaseFile(){
        this.fileAccessLevel = new PublicAccess();
    }
    @Override 
    public void setAccessLevel(FileAccessLevel fileAccessLevel){
        this.fileAccessLevel = fileAccessLevel;
    }
    
    @Override 
    public void setCompressionStrategy(CompressionStrategy compressionStrategy){
        this.compressionStrategy = compressionStrategy;
    }

    @Override 
    public void compress(){
        compressionStrategy.compress();
    }

    @Override 
    public void open(){
        fileAccessLevel.open();
    }
}
