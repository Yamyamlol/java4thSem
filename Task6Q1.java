import java.util.Arrays;
import java.util.Scanner;

class ArrayDemo{
      public void arrayFunc(int [] arr, int target){
            for (int i = 0; i < arr.length; i++) {
                  for (int j = i + 1; j < arr.length; j++) {
                      if (arr[i] + arr[j] == target) {
                          System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                      }
                  }
              }
      }
      public void arrayFunc(int[] a, int p, int[] b, int q) {
            int[] c = new int[p + q];
            int idx = 0;
            for (int i : a) {
                c[idx++] = i;
            }
            for (int i : b) {
                c[idx++] = i;
            }
            System.out.println();
            System.out.println();
            Arrays.sort(c);
            
            for(int i = 0;i<p;i++){
                  a[i] = c[i];
            }
            for(int i = 0;i<q;i++){
                  b[i] = c[i+p];
            }
            for (int i : a) {
                System.out.print(i+" ");
            }
            System.out.println();
            for (int i : b) {
                  System.out.print(i+" ");
            }
            
            
      }
      
}
public class Task6Q1{
      public static void main(String[] args) {
            ArrayDemo obj = new ArrayDemo();
            int [] arr = {4, 6, 5, -10, 8, 5, 20};
            int target = 10;
            obj.arrayFunc(arr, target);
            int[] A = { 1, 5, 6, 7, 8, 10 };
            int[] B = { 2, 4, 9 };
            obj.arrayFunc(A, 6, B, 3);

      }
}