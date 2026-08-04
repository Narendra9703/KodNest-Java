package track.MO2.TO1;

public class BMI {
    public static void main(String[] args) {

        // write your code here
        double Principal = 10000.0;
        double rate = 6.5;
        double time = 2.0;
        double simpleInterest = Principal * rate * time / 100.0;
        double totalAmount = Principal + simpleInterest;
        double Weight = 72.0;
        double height = 1.8;
        double bmi = Weight / (height * height);
        int m1 = 78;
        int m2 = 84;
        int m3 = 69;
        int m4 = 91;
        int m5 = 88;
        int totalMarks = m1 + m2 + m3 + m4 + m5;
        double Percentage = totalMarks * 100.0 / 500;
        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("BMI: " + bmi);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + Percentage);
    }
}
