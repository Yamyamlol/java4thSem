import java.util.Scanner;

public class q7TW {

      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n;
            n = scanner.nextInt();
            Bank []depositors = new Bank[n];
            for(int i = 0;i<n;i++)
            {
                  System.out.println("For banker number: "+(i+1));
                  Bank bank = new Bank();
                  scanner.nextLine();
                  System.out.print("Enter Bank Name:");
                  bank.name = scanner.nextLine();
                  
                  // scanner.nextLine();
                  System.out.print("Enter Bank Address:");
                  bank.address = scanner.nextLine();
                  
                  bank.generate(); // Generate a unique account number
                  
                  System.out.print("Enter Initial Balance:");
                  bank.balanceInAccount = scanner.nextDouble();
                  
                  System.out.println();
                  // Display account information
                  System.out.print("Account Information:");
                  bank.display();
                  System.out.println();

                  // Deposit
                  System.out.print("Enter Deposit Amount:");
                  double depositAmount = scanner.nextDouble();
                  bank.deposit(depositAmount);

                  // Withdraw
                  System.out.print("Enter Withdrawal Amount:");
                  double withdrawAmount = scanner.nextDouble();
                  bank.withdraw(withdrawAmount);

                  // Change Address
                  scanner.nextLine(); 
                  System.out.println("Changing Address...");
                  System.out.print("Enter New Address:");
                  String newAddress = scanner.nextLine();
                  bank.changeAddress(newAddress);

                  System.out.println();
                  // Display updated account information
                  System.out.println("\nUpdated Account Information:");
                  bank.display();
                  depositors[i] = bank;
                  System.out.println();
            }
            scanner.close();
            }
      }

      class Bank {
      public String name;
      public String address;
      public int accountNumber;
      public double balanceInAccount;

      public static int uniqueAccountNumberSeed = 10010;

      public void generate() {
            uniqueAccountNumberSeed++;
            accountNumber = uniqueAccountNumberSeed;
      }

      public void display() {
            System.out.println("Name: " + name);
            System.out.println("Address: " + address);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: $" + balanceInAccount);
      }

      public void deposit(double amount) {
            if (amount > 0) {
                  balanceInAccount += amount;
                  System.out.println("Deposited: $" + amount);
                  System.out.println("New Balance: $" + balanceInAccount);
            } else {
                  System.out.println("Invalid deposit amount.");
            }
      }

      public void withdraw(double amount) {
            if (amount > 0 && amount <= balanceInAccount) {
                  balanceInAccount -= amount;
                  System.out.println("Withdrawn: $" + amount);
                  System.out.println("New Balance: $" + balanceInAccount);
            } else {
                  System.out.println("Invalid withdrawal amount or insufficient balance.");
            }
      }

      public void changeAddress(String newAddress) {
            address = newAddress;
            System.out.println("Address changed to: " + address);
      }
}
