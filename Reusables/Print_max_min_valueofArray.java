import java.util.Scanner;

public class Print_max_min_valueofArray {
   public static int max(int[] array) {
      int max = 0;
      for (int i = 0; i < array.length; i++)
         if (array[i] > max)
            max = array[i];
      return max;
   }

   public static int min(int[] array) {
      int min = array[0];
      for (int i = 0; i < array.length; i++)
         if (array[i] < min)
            min = array[i];
      return min;
   }

   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int[] arr = new int[size];
      for (int i = 0; i < size; i++)
         arr[i] = sc.nextInt();

      System.out.println("Maximum value in the array is::" + max(arr));
      System.out.println("Minimum value in the array is::" + min(arr));
      sc.close();
   }
}