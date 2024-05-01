import java.util.Scanner;

public class p6 {
    public static void main(String argu[]){
         Scanner scanner = new Scanner(System.in);

        // Input temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * (9/5)) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

    }
}