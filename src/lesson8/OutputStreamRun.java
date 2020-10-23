package lesson8;

import java.io.*;

/**
 * @author Dzmitry Fursevich
 */
public class OutputStreamRun {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("output.txt");
        FileInputStream fis = new FileInputStream("input.txt");
        int b = 0;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }
        System.out.println();

        FileWriter fw = new FileWriter("output2.txt");
        FileReader fr = new FileReader("input.txt");
        int ch = 0;
        while ((ch = fr.read()) != -1) {
            fw.write(ch);
        }
        fw.close();
        fos.close();
        fis.close();
        fr.close();
    }
}
