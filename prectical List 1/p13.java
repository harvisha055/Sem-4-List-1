// Write a Java program that uses a do-while loop to iterate 
// over an integer array and compute the maximum value.

public class p13 {
      public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};

        int max = 0;
        int i = 0;

        if (array.length > 0) {
            
            do {
                if (array[i] > max) {
                    max = array[i];
                }
                i++;
            } while (i < array.length);

            System.out.println("Maximum value in the array: " + max);
        }else{
            System.out.println("Array is empty. Cannot compute the maximum value.");
        }

      }
}