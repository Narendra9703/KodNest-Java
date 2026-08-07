package track.MO2.TO3;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age: ");
        int age = sc.nextInt();
        System.out.println("Your Age is: " + age);
        System.out.println("Enter your Height: ");
        float height = sc.nextFloat();
        System.out.println("Your Height is " + height);
        sc.nextLine();
        System.out.println("Enter Your Name: ");
        String name = sc.nextLine();
        System.out.println("your Name is: " + name);
        sc.close();
    }

}