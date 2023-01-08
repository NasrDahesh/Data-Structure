import java.util.Random;
import java.util.Arrays;

public class Lap2_Q3 {

    static String[] remove(String [] A){

        Random random = new Random();
        while(A.length > 0){
            String []B = new String[A.length -1];
            int N;
            N = random.nextInt(A.length);

            for(int i = 0; i < N; i++){
                B[i] = A[i];
            }

            for(int i = N; i < A.length - 1; i++){
                B[i] = A[i + 1];
            }

            A = B;
        }
        return A;
    }

    public static void main(String[] args) {
        String[] Array = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
        Array = remove(Array);
        System.out.println(Arrays.toString(Array));
    }
}
