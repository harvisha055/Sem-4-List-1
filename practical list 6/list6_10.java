import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class list6_10 {

    public static void main(String[] args) {
        Path filePath = Paths.get("myData.csv");
        List<String> lines = null;
        try {
            lines = Files.readAllLines(filePath);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return;
        }

        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            if (line.contains("David Lee")) {
                lines.set(i, line.replaceAll("(\\d+)", "21"));
                break;
            }
        }
        try {
            Files.write(filePath, lines);
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }
    }
}