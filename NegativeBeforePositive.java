import java.util.Arrays;

public class NegativeBeforePositive {
    public static void main(String[] args) {
        int array[] = { -22, 10, -14, -15, 16, -70, 50, -13, -36 };

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                int j;
                for (j = i; j < array.length; j++) {
                    if (array[j] < 0)
                        break;
                }
                if (j != array.length) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
