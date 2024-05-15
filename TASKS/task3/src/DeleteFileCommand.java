public class DeleteFileCommand implements Command{
    @Override
    public void execute() {
        System.out.println("rm -rf : File Deleted");
    }
}
