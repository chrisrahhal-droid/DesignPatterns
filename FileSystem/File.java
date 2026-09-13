package FileSystem;

public class File implements Data{

    private String name;

    public File(String name){
        this.name = name;
    }

    @Override 
    public void open(){
        System.out.println("Opening " + name);
    }

    @Override 
    public void close(){
        System.out.println("Closing " + name);
    }
    
    @Override 
    public String getName() {
        return name;
    }

}
