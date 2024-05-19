/* 
      NAME: SANYAM RAWAT
      SECTION: D
      ROLL NO: 58
*/


import java.util.Scanner;
import java.util.HashMap;

public class q8TW {
      public static void main(String[] args) {
            
            System.out.println("\t\t\t******INPUT******");
            Scanner sc = new Scanner(System.in);
            ArrayDemo.arrayFunc();
            int n;
            System.out.print("Enter the size of array: ");
            n = sc.nextInt();
            System.out.print("Input the array: ");
            int [] nums = new int [n];
            for(int i = 0;i<n;i++){
                  nums[i] = sc.nextInt();
            }
            System.out.print("Enter target: ");
            int target = sc.nextInt();
            System.out.println("\t\t\t******INPUT******");
            ArrayDemo.arrayFunc(nums, target);
      }
}

class ArrayDemo{
      public static void arrayFunc(){
            System.out.println("This is the parameter less function");
            Scanner sc = new Scanner(System.in);
            int n;
            System.out.print("Enter the size of array: ");
            n = sc.nextInt();
            int arr[] = new int[n];
            System.out.print("Input the array: ");
            for(int i = 0;i<n;i++){
                  arr[i] = sc.nextInt();
            }
            int target;
            System.out.print("Enter target: ");
            target = sc.nextInt();
            HashMap <Integer, Integer> hm = new HashMap<>();
            System.out.println("\t\t\t******OUTPUT******");
            for(int i = 0;i<n;i++){
                  int compliment = target - arr[i];
                  if(hm.containsKey(compliment)){
                        System.out.print("{"+arr[i]+", "+(target-arr[i])+"}");
                  }
                  hm.put(arr[i], i);
            }
            System.out.println();
      }
      public static void arrayFunc(int [] nums, int target){
            System.out.println("This is the parametered function");
            HashMap <Integer, Integer> hm = new HashMap<>();
            System.out.println("\t\t\t******OUTPUT******");
            for(int i = 0;i< nums.length;i++){
                  int compliment = target - nums[i];
                  if(hm.containsKey(compliment)){
                        System.out.print("{"+nums[i]+", "+(target-nums[i])+"}");
                  }
                  hm.put(nums[i], i);
            }
            System.out.println();
      }
}