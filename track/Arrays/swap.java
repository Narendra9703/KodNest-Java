import java.util.*;
public class swap {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a & b & c values : ");
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        System.out.print("c = ");
        int c =sc.nextInt();
       int  temp = a;
        a = b;
        b = c;
        c = temp;
        System.out.println("After Swaping");
        System.out.println("a = " + a);
        System.out.println("b = "+ b);
        System.out.println("c = "+ c);

    }
}
