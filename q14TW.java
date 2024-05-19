/* 
      NAME: SANYAM RAWAT
      SECTION: D
      ROLL NO: 58
*/


import java.util.Scanner;

class MyCalculator {
    public int power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("java.lang.Exception: n and p should be non-negative");
        }
        if (n == 0 && p == 0) {
            throw new Exception("java.lang.Exception: n and p should not be zero");
        }
        return (int) Math.pow(n, p);
    }
}

public class q14TW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyCalculator calculator = new MyCalculator();
        
        System.out.println("\t\t\t******INPUT******");
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int p = sc.nextInt();
            
            System.out.println("\t\t\t******OUTPUT******");
            try {
                System.out.println(calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        
        sc.close();
    }
}
