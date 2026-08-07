package track.Practise;

public class Example4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i == 2) {
                    break;
                }
                System.out.println("i: " + i + "j:" + j);
            }
        }
    }
}
