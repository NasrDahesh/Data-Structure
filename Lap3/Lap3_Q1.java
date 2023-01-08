import java.util.Arrays;

public class Lap3_Q1 {
    public static void main(String[] args) {
        int A[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(Arrays.toString(A));

        int B[] = new int[A.length];
        System.out.println(Arrays.toString(B));
        B = A.clone();
        System.out.println(Arrays.toString(B));

    }
}
