public class RenameFileCommand implements Command{
    @Override
    public void execute() {
        System.out.println("mv oldname newname : File Renamed");
    }
}
