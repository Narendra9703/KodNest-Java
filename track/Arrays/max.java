import java.util.*;
public class max {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int []a = new int[n];
        System.out.println("Enter array elements: ");
        for (int i=0;i<n;i++){
            a[i] =sc.nextInt();
        }
        int max = a[0];
        for (int i=0;i<n;i++){
            if (a[i]>max){
                max=a[i];
            }
            System.out.println();
        }
         System.out.println("Max: " + max);
    }
}
