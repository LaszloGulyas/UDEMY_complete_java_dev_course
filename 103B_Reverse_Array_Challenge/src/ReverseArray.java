public class ReverseArray {

    private static void reverse(int[] elements) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < elements.length; i++) {
            sb.append(elements[i]);
            sb.append(", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append("]");

        System.out.println("Array = " + sb.toString());

        for (int i = 0; i < (elements.length - 1) / 2; i++) {
            int temp = elements[elements.length - 1 - i];
            elements[elements.length - 1 - i] = elements[i];
            elements[i] = temp;
        }

        sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < elements.length; i++) {
            sb.append(elements[i]);
            sb.append(", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append("]");

        System.out.println("Reversed array = " + sb.toString());
    }
}
