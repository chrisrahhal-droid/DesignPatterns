package FileSystem;

public class App {
    public static void main(String[] args){
        Directory root = new Directory("root");
        File file = new File("CV.txt");
        root.addContent(file);
        root.ls();
        Directory university = new Directory("uni");
        root.addContent(university);
        root.ls();
    }
}
