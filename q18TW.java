/* 
      NAME: SANYAM RAWAT
      SECTION: D
      ROLL NO: 58
*/


import java.util.ArrayList;
import java.util.Scanner;

public class q18TW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();
        
        System.out.println("\t\t\t******INPUT******");
        System.out.println("Enter strings (enter 'done' to finish):");
        String input = scanner.nextLine();
        while (!input.equals("done")) {
            strings.add(input);
            input = scanner.nextLine();
        }
        
        System.out.println("\t\t\t******OUTPUT******");
        System.out.println("Before removing even-length strings: " + strings);
        removeEvenLength(strings);
        System.out.println("After removing even-length strings: " + strings);

        scanner.close();
    }

    public static void removeEvenLength(ArrayList<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() % 2 == 0) {
                strings.remove(i);
                i--; // Adjust index after removal
            }
        }
    }
}
