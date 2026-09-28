package track.Strings;
public class StringBuilder3 {
    public static void main(String args[]) {
        StringBuilder sbr = new StringBuilder("Java");
        sbr.ensureCapacity(100);
        System.out.println(sbr.capacity());
        System.out.println(sbr);
        sbr.append("Program");
        System.out.println(sbr);
        sbr.insert(0, "Python");
        System.out.println(sbr);
        sbr.delete(0, 4);
        System.out.println(sbr);
        sbr.reverse();
        System.out.println(sbr);

    }
}
