import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[] {1,2,3,4,5,6};
        System.out.println(Arrays.toString(array));
        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    private static void reverse(int[] array) {
        int n = array.length;
        int t=0;
        for(int i=0; i<n/2; i++) {
            t = array[i];
            array[i] = array[n-i-1];
            array[n-i-1] = t;
        }
    }
}
