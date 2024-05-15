public class File extends FileSystemComponent{
    private String name;
    private int size;

    //Initializes the file with a name and size
    public File(String name, int size){
        this.name = name;
        this.size = size;
    }

    @Override
    public int getSize(){
        return size;
    }
}
