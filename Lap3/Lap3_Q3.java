import java.util.Arrays;

public class Lap3_Q3 {

    public static void main(String[] args) {
        int array1[] = {1, 2, 3, 4, 5};
        int array2[] = {6, 7, 8, 9, 10};
        int array3[] = new int[array1.length + array2.length];


        int A1 = array1.length;
        int A2 = array2.length;
        System.arraycopy(array1, 0, array3, 0, A1);
        System.arraycopy(array2, 0, array3, A1, A2);

        System.out.println("Array1 = " + Arrays.toString(array1) + "\n");
        System.out.println("Array2 = " + Arrays.toString(array2) + "\n");
        System.out.println("Array3 = " + Arrays.toString(array3));
    }
}
