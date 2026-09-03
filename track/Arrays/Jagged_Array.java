import java.util.Scanner;

public class Jagged_Array {
    public static void main(String args[]) {
        int[][] a = new int[3][];
        a[0] = new int[4];
        a[1] = new int[5];
        a[2] = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements: ");
        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j <= a[i].length - 1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array elements are: ");
        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j <= a[i].length - 1; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
