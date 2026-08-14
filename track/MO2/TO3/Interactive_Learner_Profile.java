package track.MO2.TO3;

import java.util.Scanner;

public class Interactive_Learner_Profile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        int solvedProblems = sc.nextInt();
        Double assessment = sc.nextDouble();
        System.out.println("Learner: " + firstName);
        System.out.println("Problems solved: " + solvedProblems);
        System.out.println("Assessment: " + assessment);

    }

}
