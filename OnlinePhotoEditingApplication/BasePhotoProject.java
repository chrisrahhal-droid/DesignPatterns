package OnlinePhotoEditingApplication;

public abstract class BasePhotoProject implements PhotoProject {

    protected PhotoProject photoProject;

    public BasePhotoProject(PhotoProject photoProject) {
        this.photoProject = photoProject;
    }

    @Override
    public String export() {
        return photoProject.export();
    }

     @Override
    public void process() {
        photoProject.process();
    }
}