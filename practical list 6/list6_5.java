import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class list6_5 {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("myFile.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}