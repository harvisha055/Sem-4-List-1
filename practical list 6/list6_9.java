import java.io.FileWriter;
import java.io.IOException;

public class list6_9 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("myData.csv");
            writer.write("Name, Age, Gender\n");
            writer.write("John Doe, 25, Male\n");
            writer.write("John Smith, 30, Female\n");
            writer.write("David Lee, 20, Male\n");
            writer.close();
            System.out.println("Data is written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}