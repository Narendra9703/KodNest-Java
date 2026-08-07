package track.MO2.TO3;

import java.util.Scanner;

public class Console_Input_with_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Byte value: ");
        byte a = scan.nextByte();
        System.out.println("Byte value is " + a);
        System.out.println("Enter short value: ");
        short b = scan.nextShort();
        System.out.println("Short value is " + b);
        System.out.println("Enter Long value: ");
        long c = scan.nextLong();
        System.out.println("Long value is " + c);
        System.out.println("Enter int value: ");
        int d = scan.nextInt();
        System.out.println("Int value is " + d);
        System.out.println("Enter float value: ");
        float e = scan.nextFloat();
        System.out.println("Float value is " + e);
        System.out.println("Enter Double value: ");
        double f = scan.nextDouble();
        System.out.println("Double value is " + f);

    }

}
