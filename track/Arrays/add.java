import java.util.*;
public class add {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array elements: ");
        for (int i=0;i<a.length;i++)
            {
                a[i] = sc.nextInt();
            }
            System.out.println("Array elements are: ");
            int sum =0;
            System.out.println("Reverse array: ");
            for (int i=a.length-1;i>=0;i--)
            {
                System.out.println(a[i]);
                sum +=a[i];
            }
            System.out.println();
            System.out.print("Total: " + sum +" ");
    }
    
}
