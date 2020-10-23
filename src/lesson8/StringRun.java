package lesson8;

/**
 * @author Dzmitry Fursevich
 */
public class StringRun {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = "hello";
        String s3 = new String(new char[]{'a', 'b', 'c', 'd'});

        System.out.println("String length: " + s1.length());
        String s4 = "";
        System.out.println("Is empty: " + s4.isEmpty());
        String s5 = null;
        if (s5 != null && !s5.isEmpty()) {
            System.out.println("String is not empty");
        }
        String s6 = "hello";
        for(int i = 0; i < s6.length(); i++) {
            System.out.print(s6.charAt(i));
        }
        System.out.println();

        String s7 = "concat";
        String s8 = "example";
        String s9 = s7.concat(s8);
        System.out.println("s7 = " + s7);
        System.out.println("s8 = " + s8);
        System.out.println("s9 = " + s9);

        String s10 = s7.replace('c', 'C');
        System.out.println("s7 = " + s7);
        System.out.println("s10 = " + s10);

        String s11 = String.valueOf(10);
        String s12 = String.join(";", s1, s2, s3);

        String s13 = "same";
        String s14 = "same1";
        if (s13.equals(s14)) {
            System.out.println("Strings are equal");
        }

        String s15 = "SAME";
        String s16 = "same";
        if (s15.equalsIgnoreCase(s16)) {
            System.out.println("Strings are equal ignore case");
        }
    }
}
