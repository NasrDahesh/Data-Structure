import java.util.Arrays;

public class Lap2_Q1 {
    public static void main(String[] args) {
        int A [] = {1, 2, 3, 4, 5, 6, 7, 8};
        int B [] = new int[A.length];
        for (int i = 0, j = A.length - 1; i < A.length; i++, j--) {
            B[j] = A[i];
        }
        for (int i = 0; i < B.length; i++) {
            System.out.println("A["+ i +"] = " + A[i] + "\t" +"B["+ i +"] = " + B[i]);
        }
    }
}
