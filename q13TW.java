import java.util.Scanner;

public class q13TW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Employee ID: ");
            int empId = sc.nextInt();
            sc.nextLine(); // consume newline left-over

            System.out.print("Enter Employee Name: ");
            String empName = sc.nextLine();

            System.out.print("Enter Department ID: ");
            int deptId = sc.nextInt();

            validateEmployeeDetails(empId, empName, deptId);

            Employee emp = new Employee(empId, empName, deptId);
            emp.printDetails();
        } catch (IncompleteOrIncorrectDataException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    static void validateEmployeeDetails(int empId, String empName, int deptId) throws IncompleteOrIncorrectDataException {
        if (empId < 2001 || empId > 5001) {
            throw new IncompleteOrIncorrectDataException("Employee ID should be between 2001 and 5001.");
        }
        if (!Character.isUpperCase(empName.charAt(0))) {
            throw new IncompleteOrIncorrectDataException("First letter of Employee Name should be in capital letter.");
        }
        if (deptId < 1 || deptId > 5) {
            throw new IncompleteOrIncorrectDataException("Department ID should be an integer between 1 and 5.");
        }
    }
}

class Employee {
    private int empId;
    private String empName;
    private int deptId;

    public Employee(int empId, String empName, int deptId) {
        this.empId = empId;
        this.empName = empName;
        this.deptId = deptId;
    }

    public void printDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Department ID: " + deptId);
    }
}

class IncompleteOrIncorrectDataException extends Exception {
    public IncompleteOrIncorrectDataException(String message) {
        super(message);
    }
}
