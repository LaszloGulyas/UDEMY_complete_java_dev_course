import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        return n;
    }

    private static int[] readElements(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] elements = new int[size];
        for (int i = 0; i < size; i++) {
            elements[i] = scanner.nextInt();
        }
        scanner.close();
        return elements;
    }

    private static int findMin(int[] elements) {
        return Arrays.stream(elements).min().orElseThrow();
    }
}
