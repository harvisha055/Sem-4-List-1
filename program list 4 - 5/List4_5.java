public class List4_5 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        // Trying to access an element with an invalid index
        try {
            System.out.println("Accessing array element at index 5: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }

        // Another example
        int index = -1;
        try {
            System.out.println("Accessing array element at index -1: " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}
