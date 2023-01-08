import java.util.Arrays;

public class Lap3_Q2 {
    String Last_Name;
    String First_Name;
    int Id;

    public Lap3_Q2(String last_Name, String first_Name, int id) {
        Last_Name = last_Name;
        First_Name = first_Name;
        Id = id;
    }

    @Override
    public String toString() {
        return "Lap3_Q2{" +
                "Last_Name='" + Last_Name + '\'' +
                ", First_Name='" + First_Name + '\'' +
                ", Id=" + Id +
                '}';
    }

    public static void main(String[] args) {
        Lap3_Q2[] N = new Lap3_Q2[2];
        N[0] = new Lap3_Q2("Nasr", "Dahesh", 10);
        N[1] = new Lap3_Q2("Ahmed", "hamed", 30);
        Lap3_Q2[] M ;
        M = N.clone();

        System.out.println(Arrays.toString(N) + "\n\n\n");

        System.out.println(Arrays.toString(M));
    }
}
