package track.MO2.TO2.Control_constructs.NEESTED_LOOPS;

public class Neested_for {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println(j);
            }
            System.out.println();
        }
    }

}
