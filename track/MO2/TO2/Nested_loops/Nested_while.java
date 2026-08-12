package track.MO2.TO2.Nested_loops;

public class Nested_while {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            int j = 1;
            while (j <= 5) {
                System.out.println(j);
                j++;
            }
            System.out.println();
            i++;
        }
    }

}
