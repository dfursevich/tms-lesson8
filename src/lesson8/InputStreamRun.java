package lesson8;

import java.io.*;

/**
 * @author Dzmitry Fursevich
 */
public class InputStreamRun {
    public static void main(String[] args) throws IOException {
        FileInputStream fos = new FileInputStream("input.txt");
        int b = 0;
        while ((b = fos.read()) != -1) {
            System.out.print((char) b);
        }
        System.out.println();

        FileReader fr = new FileReader("input.txt");
        int ch = 0;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }

        System.out.println();
        FileReader fr1 = new FileReader("input.txt");
        char[] chars = new char[10];
        while (fr1.read(chars) != -1) {
            System.out.print(String.valueOf(chars));
        }
        System.out.println();
        FileReader fr2 = new FileReader("input.txt");
        BufferedReader br = new BufferedReader(fr2);
        String str = null;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }

        fos.close();
        fr.close();
        fr1.close();
        fr2.close();
    }
}
