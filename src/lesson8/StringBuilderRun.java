package lesson8;

/**
 * @author Dzmitry Fursevich
 */
public class StringBuilderRun {
    public static void main(String[] args) {
        String s1 = "Car pass " + 10 + " kilometers with speed " + 20 + " per hour";
        String s2 = "Car pass ".concat(String.valueOf(10)).concat(" kilometers with speed ").concat(String.valueOf(20));

        StringBuilder sb = new StringBuilder();
        sb.append("Car pass ");
        sb.append(10);
        sb.append(" kilometers with speed ");
        sb.append(20);
        String s3 = sb.toString();

        StringBuilder s4 = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            s4.append(i);
        }

        String s5 = s4.toString();
    }
}
