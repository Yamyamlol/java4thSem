import java.util.Scanner;

class FirstLetterException extends Exception {
    public FirstLetterException() {
        super("First letter of the string must be capitalized");
    }

    public FirstLetterException(String message) {
        super(message);
    }
}

class OutOfRangeException extends Exception {
    public OutOfRangeException() {
        super("Out of range");
    }

    public OutOfRangeException(String message) {
        super(message + " out of range");
    }
}

public class T7Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter employee name:");
            String name = sc.nextLine();
            if (!Character.isUpperCase(name.charAt(0))) {
                throw new FirstLetterException();
            }

            System.out.print("Enter employee ID:");
            int employeeID = Integer.parseInt(sc.nextLine());
            if (employeeID < 2001 || employeeID > 5000) {
                throw new OutOfRangeException("Employee ID");
            }

            System.out.print("Enter department ID:");
            int deptID = Integer.parseInt(sc.nextLine());
            if (deptID < 1 || deptID > 5) {
                throw new OutOfRangeException("Department ID");
            }

            // If all conditions are met, print employee details
            System.out.println("Employee Name: " + name);
            System.out.println("Employee ID: " + employeeID);
            System.out.println("Department ID: " + deptID);
        } catch (FirstLetterException | OutOfRangeException | NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
