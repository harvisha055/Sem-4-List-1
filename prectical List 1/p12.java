import java.util.*;

public class p12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int product = 1;
        int i = 0;
        while (i < array.length) {
            product *= array[i];
            i++;
        }

        System.out.println("Product of array elements: " + product);
    }
}