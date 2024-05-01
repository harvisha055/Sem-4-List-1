import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class list6_11 {

    public static void main(String[] args) {
        String csvFile = "myData.csv";
        String line;
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(cvsSplitBy);
                System.out.println("Name: " + data[0] + ", Age: " + data[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}