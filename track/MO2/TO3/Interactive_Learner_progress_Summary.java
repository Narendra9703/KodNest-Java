package track.MO2.TO3;

import java.util.Scanner;

public class Interactive_Learner_progress_Summary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String fullName = scanner.nextLine();
        int days = scanner.nextInt();
        int totalSolved = 0;

        for (int i = 1; i <= days; i++) {
            int solved = scanner.nextInt();
            totalSolved = totalSolved + solved;
        }

        // Calculate daily average
        double average = (double) totalSolved / days;

        // Determine status
        String status;

        if (average >= 5.0) {
            status = "Consistent";
        } else {
            status = "Needs consistency";
        }

        // Display result
        System.out.println("Learner: " + fullName);
        System.out.println("Total solved: " + totalSolved);
        System.out.println("Daily average: " + average);
        System.out.println("Status: " + status);

        scanner.close();
    }
}
