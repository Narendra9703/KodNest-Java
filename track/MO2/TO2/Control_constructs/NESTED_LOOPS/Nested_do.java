package track.MO2.TO2.Control_constructs.NESTED_LOOPS;

public class Nested_do {
    public static void main(String[] args) {
        int i = 1;
        do {
            int j = 1;
            do {
                System.out.println(j);
                j++;
            } while (j <= 5);
            System.out.println();
            i++;
        } while (i <= 5);
    }

}
