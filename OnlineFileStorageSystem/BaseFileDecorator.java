package OnlineFileStorageSystem;

public abstract class BaseFileDecorator implements File {

    private File file;

    public BaseFileDecorator(File file) {
        this.file = file;
    }

    @Override
    public void download() {
        file.download();
    }

    @Override
    public String getDescription() {
        return file.getDescription();
    }

    
    @Override
    public void open() {
        file.open();
    }

    @Override
    public void compress() {
        file.compress();
    }

    @Override
    public void setCompressionStrategy(CompressionStrategy compressionStrategy) {
        file.setCompressionStrategy(compressionStrategy);
    }

    @Override 
    public void setAccessLevel(FileAccessLevel fileAccessLevel){
        file.setAccessLevel(fileAccessLevel);
    }
}
