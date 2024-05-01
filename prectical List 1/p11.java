public class p11 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println("Sum of All Array elements  is " + sum);
    }
}