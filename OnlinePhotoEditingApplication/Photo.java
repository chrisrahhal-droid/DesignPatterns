package OnlinePhotoEditingApplication;
public class Photo implements Cloneable{
    private String name;
    private String imageWidth;
    private String imageHeight;
    private String format;

    public Photo(String projectName, String imageWidth, String imageHeight, String format){
        this.name = projectName;
        this.imageWidth = imageWidth;
        this.imageHeight = imageHeight;
        this.format = format;
    }

    public Photo clone(){
        try {
           return (Photo) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String projectName) {
        this.name = projectName;
    }

    public String getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(String imageWidth) {
        this.imageWidth = imageWidth;
    }

    public String getImageHeight() {
        return imageHeight;
    }

    public void setImageHeight(String imageHeight) {
        this.imageHeight = imageHeight;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
    
}
