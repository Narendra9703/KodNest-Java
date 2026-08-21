
import java.util.Scanner;

public class Pgm5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter array elements: ");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scanner.nextInt();
        }
        int sum = 0;

        for (int i = 0; i <= a.length - 1; i++) {
            System.out.print(a[i] + " + ");
            sum = sum + a[i];
        }
        System.out.println(" = total : " + sum);
    }
}
