/* 
      NAME: SANYAM RAWAT
      SECTION: D
      ROLL NO: 58
*/


import java.util.Scanner;
class q2TW{
      public static void main(String[] args) {
            String s1,s2;
            Scanner sc = new Scanner(System.in);
            System.out.println("\t\t\t******INPUT******");
            System.out.print("Input s1: ");
            s1 = sc.nextLine();
            System.out.print("Input s2: ");
            s2 = sc.nextLine();
            char var;
            System.out.println("\t\t\t******OUTPUT******");
            System.out.print("Input a char: ");
            var= sc.next().charAt(0);
            for(int i = 0;i < s1.length(); i++){
                  if(s1.charAt(i) == var){
                        System.out.println("Index of "+var+" in s1 is "+i);
                        break;
                  }
            }
            for(int i = 0;i < s1.length(); i++){
                  if(s2.charAt(i) == var){
                        System.out.println("Index of "+var+" in s2 is "+i);
                        break;      
                  }
            }
            System.out.print("Enter an index: ");
            int idx = sc.nextInt();
            System.out.println("The character at index "+ idx + " of s1 is "+s1.charAt(idx));
            System.out.println("The character at index "+ idx + " of s2 is "+s2.charAt(idx));
            StringBuilder s1toggled = new StringBuilder();  
            StringBuilder s2toggled = new StringBuilder();  
            for (char ch : s1.toCharArray()) 
            {  
                  if (Character.isUpperCase(ch)) 
                        s1toggled.append(Character.toLowerCase(ch));  
                  else 
                        s1toggled.append(Character.toUpperCase(ch));  
            }
            for (char ch : s2.toCharArray()) 
            {  
                  if (Character.isUpperCase(ch)) 
                        s2toggled.append(Character.toLowerCase(ch));  
                  else 
                        s2toggled.append(Character.toUpperCase(ch));  
            }
            
            System.out.println("S1: "+s1toggled+" S2: "+s2toggled);
            if(s1.equals(s2))       System.out.println("Strings are equal");
            else                    System.out.println("Strings are not equal");
            if(s1.contains(s2))     System.out.println("S2 is a substring of S1");
            else                    System.out.println("S2 is not a substring of s1");
      }
}