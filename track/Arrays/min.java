import java.util.*;
public class min {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n =sc.nextInt();
        int[] a =new int[n];
        System.out.println("Enter elements: ");
        for (int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int min =a[0];
        for (int i=0;i<a.length-1;i++){
            if(a[i]<min){
                min =a[i];
            }
        }
        System.out.println("Minimum: " + min );
    }
    
}
