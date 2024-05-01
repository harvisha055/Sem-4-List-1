import java.util.*;

public class p9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);

        System.out.print("Enter any number or String :: ");
        String input = sc.nextLine();
        boolean isPalindrome = true;

        String cleanStr = input.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        int left = 0;
        int right = cleanStr.length() -1;

        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                isPalindrome = false;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

    }
}