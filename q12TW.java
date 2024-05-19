import java.util.Scanner;

public class q12TW {
    public static void main(String[] args) {
        q12TW scenarios = new q12TW();
        
        // Scenario a: Default throw and default catch (JVM)
        System.out.println("Scenario a: Default throw and default catch (JVM)");
        try {
            scenarios.defaultThrowDefaultCatch();
        } catch (Exception e) {
            System.out.println("Caught an exception in main: " + e.getMessage());
        }

        System.out.println();

        // Scenario b: Default throw (JVM) and Explicit catch handler
        System.out.println("Scenario b: Default throw (JVM) and Explicit catch handler");
        scenarios.defaultThrowExplicitCatch();

        System.out.println();

        // Scenario c: Explicit throw and default catch handler
        System.out.println("Scenario c: Explicit throw and default catch handler");
        try {
            scenarios.explicitThrowDefaultCatch();
        } catch (Exception e) {
            System.out.println("Caught an exception in main: " + e.getMessage());
        }

        System.out.println();
        
        // Scenario d: Explicit throw and Explicit catch handler
        System.out.println("Scenario d: Explicit throw and Explicit catch handler");
        scenarios.explicitThrowExplicitCatch();
    }

    public void defaultThrowDefaultCatch() {
        int result = 10 / 0;
        System.out.println("This line will not be executed.");
    }

    public void defaultThrowExplicitCatch() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        }
        System.out.println("Program continues after the catch block.");
    }

    public void explicitThrowDefaultCatch() {
        throw new RuntimeException("Explicitly thrown RuntimeException");
    }

    public void explicitThrowExplicitCatch() {
        try {
            throw new RuntimeException("Explicitly thrown RuntimeException");
        } catch (RuntimeException e) {
            System.out.println("Caught an RuntimeException: " + e.getMessage());
        }
        System.out.println("Program continues after the catch block.");
    }
}
