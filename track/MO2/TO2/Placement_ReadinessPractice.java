package track.MO2.TO2;

public class Placement_ReadinessPractice {
    public static void main(String[] args) {
        int marks = 68;
        int attendance = 80;
        int practiceDays = 3;
        String placement = marks >= 60 && attendance >= 75 ? "Placement Ready" : "Continue Preparation";
        System.out.println(placement);
        System.out.println("Practice Day: 1 ");
        System.out.println("Practice Day: 2");
        System.out.println("Practice Day: 3");
    }

}
