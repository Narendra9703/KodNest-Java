package track.Strings;

public class StringBuider2 {
    public static void main(String[] args){
        StringBuilder sbr = new StringBuilder("Java");
        sbr.ensureCapacity(100);
        System.out.println(sbr.capacity());
        System.out.println(sbr);
        sbr.append("Program");
        System.out.println(sbr);
    }
}