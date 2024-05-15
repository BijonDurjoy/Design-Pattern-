public class CommandExecutor {
    private String role;
    private Command createCommand;
    private Command deleteCommand;
    private Command renameCommand;

    public CommandExecutor(){
        this.createCommand = new CreateFileCommand();
        this.deleteCommand = new DeleteFileCommand();
        this.renameCommand = new RenameFileCommand();
    }
    //Initializes the command executor with a user role and commands.

    public CommandExecutor(String role){
        this();
        this.role = role;
    }
    public void executeCommand(String commandName) {
        if (commandName.equals("delete") && !role.equals("admin")) {
            System.out.println("Access Denied!");
        } else {
            switch (commandName) {
                case "create":
                    createCommand.execute();
                    break;
                case "delete":
                    deleteCommand.execute();
                    break;
                case "rename":
                    renameCommand.execute();
                    break;
                default:
                    System.out.println("Command '" + commandName + "' not recognized");
            }
        }
    }
}

