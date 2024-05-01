import java.util.Scanner;

public class List4_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an integer (or a non-numeric value to quit): ");
            String input = scanner.nextLine();

            try {
                int number = Integer.parseInt(input);
                System.out.println("You entered: " + number);
            } catch (NumberFormatException e) {
                System.out.println("Error: The input is not a valid integer.");
                break;
            }
        }

        System.out.println("Goodbye!");
        scanner.close();
    }
}