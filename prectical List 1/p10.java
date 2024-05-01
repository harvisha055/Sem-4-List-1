import java.util.*;

public class p10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();

        if (isArmstrongNumber(n)) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }

        scanner.close();
    }

    // Function to check if a number is an Armstrong number
    private static boolean isArmstrongNumber(int num) {
        int originalNumber = num;
        int Digits = countDigits(num);
        int sum = 0;

        while (num > 0) {
            int r = num % 10;
            sum += Math.pow(r, Digits);
            num /= 10;
        }

        return sum == originalNumber;
    }

    // Function to count the number of digits in a number
    private static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}