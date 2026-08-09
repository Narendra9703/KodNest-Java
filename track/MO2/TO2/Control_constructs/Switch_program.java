package track.MO2.TO2.Control_constructs;

import java.util.Scanner;

public class Switch_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("NUMBER ONE");
                break;
            case 2:
                System.out.println("NUMBER TWO");
                break;
            case 3:
                System.out.println("NUMBER THREE");
                break;
            case 4:
                System.out.println("NUMBER FOUR");
            default:
                System.out.println("Invalid");
        }

    }
}