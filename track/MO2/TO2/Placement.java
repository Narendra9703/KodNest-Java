package track.MO2.TO2;

public class Placement {
    public static void main(String[] args) {
        int marks = 72;
        int attendance = 80;
        boolean activeBacklog = false;
        boolean projectCompleted = true;
        int mockInterviewScore = 65;
        boolean academicEligibility = marks > 60 && attendance >= 75 && activeBacklog == false;
        // Write the placement-readiness decision
        if (academicEligibility = false) {
            System.out.println("Improve Academic Eligibility");
        } else if (academicEligibility == true && projectCompleted == false) {
            System.out.println("Complete the project");
        } else if (projectCompleted = true && mockInterviewScore < 70) {
            System.out.println("Improve Interview Skills");
        } else {
            System.out.println("Placement Ready");

        }
    }
}
