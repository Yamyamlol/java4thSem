import java.util.Scanner;

public class q6TW {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Employee e1 = new Employee();
            System.out.print("Enter Name: ");
            e1.name = sc.nextLine();
            System.out.print("Enter EmployeeID: ");
            e1.EmpID = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Department: ");
            e1.dept = sc.nextLine();
            e1.printData();
      }
}
class Employee {
      public String name;
      public int EmpID;
      public String dept;

      public void printData(){
            System.out.println("Name: "+name);
            System.out.println("Employee ID: "+EmpID);
            System.out.println("Department: "+dept);
      }
      
}