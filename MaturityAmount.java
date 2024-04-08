import java.util.Scanner;
import java.lang.Math;

public class MaturityAmount {
      public static void main(String[] args) {
            
            //variable declaration
            int principal;
            float rate;
            int timePeriod;
            double amount;
            Scanner sc = new Scanner(System.in);
            boolean correctOption = false;

            System.out.println("\t\t\tMENU");
            System.out.println("Press 1 for term deposit");
            System.out.println("Press 2 for recurring deposit");
            do
            {
                  int choice = sc.nextInt();
                  switch (choice) {
                        case 1:
                        System.out.println("Fill the following requirements");
                        System.out.println("Principal: ");
                        principal = sc.nextInt();
                        System.out.println("Rate: ");
                        rate = sc.nextFloat();
                        System.out.println("Time period: ");
                        timePeriod = sc.nextInt();
                        amount = principal*(Math.pow((1+rate/100), timePeriod));
                        System.out.println("The maturity amount is: "+amount);
                        correctOption = true;
                        break;
                        
                        case 2:
                        System.out.println("Fill the following requirements");
                        System.out.println("Principal: ");
                        principal = sc.nextInt();
                        System.out.println("Rate: ");
                        rate = sc.nextFloat();
                        System.out.println("Time period: ");
                        timePeriod = sc.nextInt();
                        amount = principal * timePeriod +(principal * timePeriod *(timePeriod + 1) / 2 * rate / 100 * 1 /12);
                        System.out.println("The maturity amount is: "+amount);
                        correctOption = true;
                        break;
                        
                        default:
                        System.out.println("Choose a Correct option");
                        break;
                  }
            } while(!correctOption);
                  
                  
      }
}
