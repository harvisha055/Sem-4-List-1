import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two integers
        System.out.print("Enter the first integer (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the second integer (b): ");
        int b = scanner.nextInt();

        // Perform arithmetic operations
        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;

        // Check if the second number is not zero before performing division and modulo
        int division = 0;
        int modulo = 0;
        if (b != 0) {
            division = a / b;
            modulo = a % b;
        } else {
            System.out.println("Cannot perform division and modulo when the second number is zero.");
        }

        // Display results
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);

        if (b != 0) {
            System.out.println("Division: " + division);
            System.out.println("Modulo: " + modulo);
        }

    }
}