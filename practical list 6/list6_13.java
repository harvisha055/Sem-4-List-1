import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class list6_13{

    public static void main(String[] args) {
        Path sourcePath = Paths.get("myFile.txt");
        Path targetPath = Paths.get("myDirectory", "myFile.txt");
        Path targetDir = Paths.get("myDirectory");

        try {
            // Create the target directory if it doesn't exist
            Files.createDirectory(targetDir);

            // Move the file to the target directory
            Files.move(sourcePath, targetPath);
            System.out.println("File moved successfully.");
        } catch (IOException e) {
            System.err.println("Error moving file: " + e.getMessage());
        }
    }
}