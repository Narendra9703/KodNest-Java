package track.MO2.TO2;

public class Conditional {
    public static void main(String[] args) {

        int number = -7;

        int firstscore = 18;

        int secondScore = 25;

        if (number > 0) {

            System.out.println("Number type: Positive");

        } else if (number < 0) {

            System.out.println("Number type: Negative");

        } else {
            System.out.println("Number type: zero");
        }
        if (number % 2 == 0) {

            System.out.println("Parity: Even");
        } else {
            System.out.println("Parity: Odd");
        }
        if (firstscore >= secondScore) {
            System.out.println("Larger score: " + firstscore);

        } else {
            System.out.println("Larger score: " + secondScore);
        }
    }
}
