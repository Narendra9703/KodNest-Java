
import java.util.Scanner;

public class Pgm2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < 4; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println("Array elements are:");
        for (int i = 0; i < 4; i++) {
            System.out.println(a[i]);
        }
    }
}
