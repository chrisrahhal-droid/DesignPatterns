package FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Data{

    private List<Data> content;
    private String name;
    
    public Directory(String name){
        this.content = new ArrayList<>();
        this.name = name;
    }

    public void addContent(Data data){
        content.add(data);
    }

    public void removeContent(Data data){
        content.remove(data);
    }

    @Override
    public void open() {
        System.out.println("Opening " + name);
    }

    @Override
    public void close() {
        System.out.println("Closing " + name);
    }

    public void ls(){
        for(Data data: content){
            System.out.println(data.getName());
        }
    }

    @Override 
    public String getName() {
        return name;
    }
}
