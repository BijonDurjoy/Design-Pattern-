import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemComponent{
    public String name;
    private List<FileSystemComponent> children;

    //Initializes the directory with a name
    public Directory(String name){
        this.name= name;
        this.children = new ArrayList<>();
    }

    //Add a component to the directory
    public void addComponent(FileSystemComponent component){
        children.add(component);
    }
    //Remove a component from the directory
    public void removeComponent(FileSystemComponent component){
        children.remove(component);
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for(FileSystemComponent component: children){
            totalSize += component.getSize();
        }
        return totalSize;
    }
}
