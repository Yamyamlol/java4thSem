/* 
      NAME: SANYAM RAWAT
      SECTION: D
      ROLL NO: 58
*/


import java.util.Scanner;

public class q5TW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\t******INPUT******");
        System.out.print("enter an integer: ");
        int num = sc.nextInt();
        
        String n = String.valueOf(num);
        
        System.out.println("\t\t\t******OUTPUT******");
        StringBuffer no = new StringBuffer(n); 
        for (int i = 0; i < no.length(); i++) {
            if (no.charAt(i) == '0')
            no.setCharAt(i, '1');
        }

        num = Integer.parseInt(no.toString());
        System.out.println(num);
        
        sc.close();
    }
}
