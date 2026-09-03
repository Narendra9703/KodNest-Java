import java.util.Scanner;

public interface Three_D {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[][][] a = new int[3][3][5];
        System.out.println("Enter array elements: ");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                for (int k = 0; k <= 4; k++) {
                    a[i][j][k] = sc.nextInt();
                }
            }
        }
        System.out.println("Array elements are: ");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                for (int k = 0; k <= 4; k++) {
                    System.out.print(a[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}
