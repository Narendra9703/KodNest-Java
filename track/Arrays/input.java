import java.util.*;
public class input {
   public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int n =sc.nextInt();
    int marks[] = new int[n];
    System.out.println("Enter array elements: ");
    for (int i=0;i<marks.length;i++){
        marks[i] = sc.nextInt();
    }
    System.out.println("array elements are: ");
    for (int i=0;i<marks.length;i++){
        System.out.println("Marks["+i+"] = "+ marks[i]);
        System.out.println(i);
        System.out.println(marks);
    }
   }
}
