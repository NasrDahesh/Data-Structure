public class Lap3_Q4 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7};
        int[] array2 = {10, 20, 30, 40, 50, 60, 70};
        boolean b = true;
        if (array1 == array2)
            System.out.println(true);
        else if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {

                if (array1[i] == array2[i]) {
                    b = true;

                }
                else
                    b = false;
            }

        }
        if (b == true)
            System.out.println("equals");

        else
            System.out.println("not equals");
    }
}
