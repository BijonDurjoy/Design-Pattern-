public class Main{
    public static void main(String[] args) {
        System.out.println("Admin commands: ");
        CommandExecutor adminExecutor = new CommandExecutor("admin");
        adminExecutor.executeCommand("create");
        adminExecutor.executeCommand("delete");
        adminExecutor.executeCommand("rename");
        System.out.println("\n\n");

        System.out.println("Normal User commands: ");
        CommandExecutor userExecutor = new CommandExecutor("normal_user");
        userExecutor.executeCommand("create");
        userExecutor.executeCommand("delete");
        userExecutor.executeCommand("rename");
        System.out.println("\n\n");
    }
}
/*
    OUTPUT:
Admin commands:
Touch x : File Created
rm -rf : File Deleted
mv oldname newname : File Renamed

Normal User commands:
Touch x : File Created
Access Denied!
mv oldname newname : File Renamed
 */