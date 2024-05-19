/* 
      NAME: SANYAM RAWAT
      SECTION: D
      ROLL NO: 58
*/


import java.util.Scanner;

public class q3TW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t\t\t******INPUT******");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        int digitCount = 0;
        int alphabetCount = 0;
        int wordCount = 0;
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                digitCount++;
            } else if (Character.isLetter(ch)) {
                alphabetCount++;
            }
        }
        
        if (input.trim().isEmpty()) {
            wordCount = 0;
        } else {
            String[] words = input.trim().split("\\s+");
            wordCount = words.length;
        }
        
        System.out.println("\t\t\t******OUTPUT******");
        System.out.println("Number of digits: " + digitCount);
        System.out.println("Number of alphabets: " + alphabetCount);
        System.out.println("Number of words: " + wordCount);
        
        scanner.close();
    }
}
