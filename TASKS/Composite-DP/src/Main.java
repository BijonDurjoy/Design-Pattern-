public class Main {
    public static void main(String[] args) {

        //Creating files
        File file1 = new File("Bijon_cv.pdf",120);
        File file2 = new File("Prio.jpg",200);
        File file3 = new File("Video.mp4",1500);
        File file4 = new File("swe.txt",500);
        File file5 = new File("Redme.md",420);

        // Creating directories
        Directory directory1 = new Directory("Docs");
        directory1.addComponent(file1);
        directory1.addComponent(file4);
        directory1.addComponent(file5);

        Directory directory2 = new Directory("Pics and Vids");
        directory2.addComponent(file2);
        directory2.addComponent(file3);

        Directory rootDirectory = new Directory("Root");
        rootDirectory.addComponent(directory1);
        rootDirectory.addComponent(directory2);

        // Displaying size of the entire file system
        System.out.println("Total size of '" + rootDirectory.name + "' directory = " + rootDirectory.getSize() + " bytes");
    }
}

//Output: Total size of 'Root' directory = 2740 bytes