import java.util.Scanner;

public class q4TW {
    public static void main(String[] args) {
        int m;
        Scanner sc = new Scanner(System.in);
        System.out.print("INPUT: M = ");
        m = sc.nextInt();
        try {
            if (m <= 2 || m >= 10)
                throw new IllegalArgumentException("Value must be greater than 2 and less than 10");

            int A[][] = new int[m][m];
            System.out.println("Enter the matrix elements:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    A[i][j] = sc.nextInt();
                }
            }

            System.out.println("OUTPUT: ORIGINAL MATRIX");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(A[i][j] + " ");
                }
                System.out.println();
            }

            // Rotate the matrix
            for (int i = 0; i < m; i++) {
                for (int j = i; j < m; j++) {
                    int temp = A[i][j];
                    A[i][j] = A[j][i];
                    A[j][i] = temp;
                }
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m / 2; j++) {
                    int temp = A[i][j];
                    A[i][j] = A[i][m - 1 - j];
                    A[i][m - 1 - j] = temp;
                }
            }

            System.out.println("ROTATED MATRIX");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(A[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Sum of the corner elements = " + (A[0][0] + A[m - 1][0] + A[0][m - 1] + A[m - 1][m - 1]));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
